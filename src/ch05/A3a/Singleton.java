package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); //생성될 때 시간이 걸리도록 함- 시간이 오래 걸리면 다른 객체를 생성할 가능성 높음
    }
    //public static Singleton getInstance() {
    public static synchronized Singleton getInstance() { //synchronized  키워드 추가
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); //객체가 CPU를 내놓고 잠은 잔다.
        } catch (InterruptedException e) { //잠을 자다고 깨우는 것(오류)
        }
    }
}
