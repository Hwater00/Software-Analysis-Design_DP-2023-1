package ch17.pratice;

public class DigitObserver implements Observer {
    //통지 받아서 하는 일
    @Override
    public void update(NumberGenerator generator) { //관찰 대상을 받음
        System.out.println("DigitObserver:" + generator.getNumber()); //관찰 대상에게 숫자를 얻어옴
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
