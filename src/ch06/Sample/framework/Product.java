package ch06.Sample.framework;

//Clonable 인터페이스를 상속하였기에 이를 구현한 클래스는 복제를 만들 수 있다.
public interface Product extends Cloneable {  //인터페이스끼리 상속 받을 수 있음.
    public abstract void use(String s);
    
    //Prototype 패턴
    public abstract Product createCopy(); //자기 복제품을 반환하는 메소드
}
