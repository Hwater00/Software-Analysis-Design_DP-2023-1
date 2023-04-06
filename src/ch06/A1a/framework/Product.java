package ch06.A1a.framework;

//인터럽트에서 추상 클래스로 변경, 구현한 클래스가 하나라도 있으면 인터페이스가 아니다.
public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
