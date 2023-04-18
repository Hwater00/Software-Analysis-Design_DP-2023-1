package ch05.A1;

public class TicketMaker {
    private int ticket = 1000;
    
    //singleton이 클래스 로드될 때 한 개
    private static TicketMaker singleton = new TicketMaker();

    //생성자를 private으로
    private TicketMaker() {
    }

    //getInstance()
    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
