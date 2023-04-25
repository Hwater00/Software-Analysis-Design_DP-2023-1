package ch05.A3a;

// Main 클래스가 스레드 클래스임
public class Main extends Thread { 
    public static void main(String[] args) {
        System.out.println("Start.");
        
        //스레드 객체가 3개 생성됨
        new Main("A").start(); //void java.lang.Thread.start()
        new Main("B").start(); //각각 시작해라
        new Main("C").start(); //각각 시작해라
    
        System.out.println("End.");
    }
//
    public Main(String name) {
        super(name);
    }

    @Override
    public void run() { // 이 스레드가 하는 일이 작성되는 메소드
        Singleton obj = Singleton.getInstance(); // Singleton 객체를 생성함
        System.out.println(getName() + ": obj = " + obj);
    }
}
