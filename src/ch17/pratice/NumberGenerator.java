package ch17.pratice;

import java.util.ArrayList;
import java.util.List;

//관찰대상
public abstract class NumberGenerator { 
    // Observer를 저장한다 
    private List<Observer> observers = new ArrayList<>(); //관찰자들을 보관하는 속성 

    // Observer를 추가한다 , 관찰자를 등록한다.
    public void addObserver(Observer observer) { //부모타입 observer
        observers.add(observer); //리스트에 추가
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) { 
        observers.remove(observer); 
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        //확장 for문
        for (Observer o: observers) { // 원소타입: 컬렉션 객체
            o.update(this); //관찰자에게 통지
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}
