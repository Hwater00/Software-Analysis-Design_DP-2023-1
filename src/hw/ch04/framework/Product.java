package hw.ch04.framework;

public abstract class Product {
    public static Object modelName;

    // public abstract Product(); 추상클래스 정의 시 생성자를 선언해도 상속X
    //추상클래스도 생성자를 가질 수 있음
    public abstract void use();

    public Object getModelName() {
      return null;
    }
}
