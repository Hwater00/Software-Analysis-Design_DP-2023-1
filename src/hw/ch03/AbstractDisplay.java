package hw.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
   //선언
    protected abstract void open(); //상속관계, 같은 패키지에서만 호출
    public abstract void print();
    public abstract void close();

    
    // display는 AbstractDisplay에서 구현하는 메소드 
    //구현
    public final void display(int times) { // 구상 메소드
        //흐름의 큰 틀을 제공함=> 템플릿 메소드
        //추상 메소드들을 이용해서 구현
        open();
        for (int i = 0; i < times; i++) {  
            print();
        }
        close();
    }
}
