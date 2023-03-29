package ch03.practice;

public class Main {
  public static void main(String[] args){
  
  AbstractDisplay x; 
  
    //부모타입  변수    = new 자식 타입();
    x = new CharDisplay('a');
    x.open();
    x.print();
    x.close();
  
    x.display(); //AbstractDisplay에서 물려받은 메소드

    AbstractDisplay s = new StringDisplay("김혜수");
    s.open();
    s.print();
    s.close();

    s.display();

    //부모 타입으로 선언하면 자식을 다 사용 가능
    x= new StringDisplay("김혜수");
    x.open();
    x.print();
    x.close();
  }
}
