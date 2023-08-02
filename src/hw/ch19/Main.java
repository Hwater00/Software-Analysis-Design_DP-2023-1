package hw.ch19;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample/ 20200733 김혜수");
        while (true) {
            for (int hour = 15; hour <= 24; hour++) {
                frame.setClock(hour);   // 시간 설정
                try {
                    Thread.sleep(2000); //2초
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
