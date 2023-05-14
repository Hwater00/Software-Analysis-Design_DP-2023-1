package ch17.A2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener {
    //클래스 안에 클래스가 있는 내부 클래스, 안에서만 사용됨

    // GraphText는 통지된 수를 텍스트 필드로 표시하는 static 클래스 
    static class GraphText extends TextField implements Observer { //특수한 형태의 텍스트필드
        public GraphText(int columns) {
            super(columns); 
        }

        //통지를 받음
        @Override
        public void update(NumberGenerator generator) {
            int number = generator.getNumber(); //숫자를 얻음

            String text = number + ":";
            for (int i = 0; i < number; i++) {
                text += '*';
            }

            setText(text);
        }
    }

    // GraphCanvas는 통지된 수를 원그래프로 표시하는 static 클래스 
    static class GraphCanvas extends Canvas implements Observer { //특수한 형태의 도화지
        private int number;

        
        @Override
        public void update(NumberGenerator generator) {
            number = generator.getNumber(); 
            repaint(); // 상속받아서 호출=> 도화지를 clear한 후 paint()를 자동 호출
        }

        public void paint(Graphics g) {
            int width = getWidth();
            int height = getHeight();

            //원 전체를 그림
            g.setColor(Color.white);
            g.fillArc(0, 0, width, height, 0, 360);
            
            //원호를 그림
            g.setColor(Color.red);
            g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
        }
    }

//생성
    private GraphText textGraph = new GraphText(60); 
    private GraphCanvas canvasGraph = new GraphCanvas();
    private Button buttonClose = new Button("Close");

    public FrameObserver() {
        super("FrameObserver"); //부모 생성자 호출

        setLayout(new BorderLayout());

        setBackground(Color.lightGray); //배경색 설정

        textGraph.setEditable(false);

        canvasGraph.setSize(500, 500); //도화지 크기 설정

        //추가할 때 위치 지정
        add(textGraph, BorderLayout.NORTH);
        add(canvasGraph, BorderLayout.CENTER);
        add(buttonClose, BorderLayout.SOUTH);

        buttonClose.addActionListener(this); 
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //액션리스너 
        System.out.println(e.toString());
        System.exit(0); //종료됨
    }

    @Override
    public void update(NumberGenerator generator) {
        textGraph.update(generator); //텍스트 필드
        canvasGraph.update(generator); //원이 그려지는 도화지
    }
}

