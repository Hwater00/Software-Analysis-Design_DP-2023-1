package hs.ch03.sample;

public class Main {
  public static void main(String[] args) {
    //Abstract 클래스 타입 변수
    // AbstractDisplay a1 = new CharDisplay('k');
    AbstractDisplay a2 = new StringDisplay("hs");
    // a1.display();
    a2.display();
    
    //Interface 타입 변수
    InterfaceDisplay i1 = new CharDisplay('k');
    i1.display(3);
  }
}
