package ch17.pratice;

// 관찰자
public interface Observer {
    //통지받을 때 호출되는 메소드
    public abstract void update(NumberGenerator generator); //인자로 관찰대상이 들어옴
}
