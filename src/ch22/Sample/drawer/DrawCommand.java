package ch22.Sample.drawer;

import ch22.Sample.command.Command;
import java.awt.Point;

public class DrawCommand implements Command {
    // 그리는 대상 
    protected Drawable drawable; // Reciver가 항상 있어야 한다.

    // 그리는 위치= 좌표 타입
    private Point position;

    // 생성자 
    //public DrawCommand(Drawable drawable, Point position, 정보추가) {
    public DrawCommand(Drawable drawable, Point position) { //Reciver와 좌표를 인자로 받는다
        this.drawable = drawable;
        this.position = position;
    }

    // 실행
    @Override
    public void execute() {
        drawable.draw(position.x, position.y); //실제 그리는 일
    }
}
