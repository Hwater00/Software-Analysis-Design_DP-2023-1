package ch22.Sample.drawer;

import ch22.Sample.command.MacroCommand;

import java.awt.Canvas; //도화지 역할
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Drawable { //그리기 명령을 받는 Drawable 
    // 그리는 색 
    private Color color = Color.blue;
    // 그리는 점의 반지름으로 원의 크기를 결정함
    private int radius = 6;
    // 이력 
    private MacroCommand history; 

    // 생성자 
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 이력 전체 다시 그리기 
    @Override
    public void paint(Graphics g) { 
        history.execute(); //실제 그리지 않고 drawCommand의 excute()를 호출
    }

    // 그리기 
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics(); //Graphics 객체를 얻어옴
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
