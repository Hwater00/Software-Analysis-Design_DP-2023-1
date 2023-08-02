package ch22.Sample;

import ch22.Sample.command.*;
import ch22.Sample.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class Main extends JFrame, WindowListener implements MouseMotionListener {
// -> 이미 Main은 JFRame을 상속받고 있어서 WindowListener도 상속받을 수 없다.


public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력 - history 생성
    private MacroCommand history = new MacroCommand();
    // 그리는 영역 
    private DrawCanvas canvas = new DrawCanvas(400, 400, history); 
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear");

    // 생성자 
    public Main(String title) {
        super(title);

        //리스너 등록
        this.addWindowListener(this);

//MouseMotionListener 여러 방법으로 등록
        //방법1 : canvas.addMouseMotionListener(this);

        //방법2 :익명의 내부 클래스를 이용해서 리스너 등록해보기
        // canvas.addMouseMotionListener(new MouseMotionListener() {
        // @Override
        // public void mouseMoved(MouseEvent e) {}

        // @Override
        // public void mouseDragged(MouseEvent e) { // 눌린 상태에서 움직임
        //     Command cmd = new DrawCommand(canvas, e.getPoint()); 
        //     history.append(cmd); //히스토리에 담은 후
        //     cmd.execute(); // drawCommand로 그림 그린다
        //     }

        // } );

        // 방법3: 익명의 내부 클래스와 어댑터를 이용해서 리스너 등록해보기
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) { // 눌린 상태에서 움직임
                Command cmd = new DrawCommand(canvas, e.getPoint()); 
                history.append(cmd); //히스토리에 담은 후
                cmd.execute(); // drawCommand로 그림 그린다
                }
    
            } );


        //ActionListener는 function interface(actionPerformed 하나만 선언되어 있기 때문)
        // Functional Interface가 들어갈 자리에는 람다식을 넣을 수 있다.
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint(); // (1)내용이 지워짐 (2)자동으로 paint() 호출
        });

        //GUI 컴포넌트 추가
        Box buttonBox = new Box(BoxLayout.X_AXIS); // 가로로 배치하겠다.
        buttonBox.add(clearButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS); // 세로로 배치하겠다
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        // 프래임에 추가
        getContentPane().add(mainBox); 

        pack();
        setVisible(true);
    }

    // MouseMotionListener용 - canvas에 달아놈
    @Override
    public void mouseMoved(MouseEvent e) { // 누르지 않은 상태에서 움직임
    }

    @Override
    public void mouseDragged(MouseEvent e) { // 눌린 상태에서 움직임
        //Command cmd = new DrawCommand(canvas, e.getPoint(), 정보 추가); // e.getPoin()는  이벤트가 발생한 곳 좌표
        Command cmd = new DrawCommand(canvas, e.getPoint()); // e.getPoin()는  이벤트가 발생한 곳 좌표
        
        //System.out.println("드래그 이벤트 발생: x좌표:" +e.getPoint().getX());
        //System.out.println("드래그 이벤트 발생: y좌표:" +e.getPoint().getY());
        
        history.append(cmd); //히스토리에 담은 후
        cmd.execute(); // drawCommand로 그림 그린다
    }

    // WindowListener용 
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("윈도우가 닫힙니다.");
        System.exit(0);
    }

    @Override public void windowActivated(WindowEvent e) {
        //윈도우가 포커스를 얻을때
    }
    @Override public void windowClosed(WindowEvent e) {
        //완전히 종료가 끝난 후 마무리 작업 시 구현
    }
    @Override public void windowDeactivated(WindowEvent e) {
        //윈도우가 포커스를 잃을때
    }
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {
        System.out.println("윈도우가 미니마이즈됩니다.");
    }
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
