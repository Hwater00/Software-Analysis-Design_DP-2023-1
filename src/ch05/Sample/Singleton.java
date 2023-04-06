package ch05.Sample;

public class Singleton {
    //미리 만들어준다 = eager initialization
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
