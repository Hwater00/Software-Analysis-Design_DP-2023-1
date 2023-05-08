package ch12.Sample;

//장식자를 대표하는 클래스, 장식 대상을 담아둔다.
public abstract class Border extends Display {
    // 내용물(장식대상) 가리킴. 
    protected Display display;             // 이 장식틀이 감싸는 '내용물'

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
