package ch04.practice.framework;

//인스턴스를 생성하는 뼈대 역할,  패턴으로 생성되는 인스턴스가 가져야 할 인터페이스를 결정
public abstract class Product {
    // public abstract Product(); 추상클래스 정의 시 생성자를 선언해도 상속X
    //추상클래스도 생성자를 가질 수 있음
    public abstract void use();  //'무엇이든 use할 수 있는(시용할 수 있는) 것'을 제품으로 규정합니다.
}
