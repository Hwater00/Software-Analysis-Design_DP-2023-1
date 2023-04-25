package hw.ch11;

// 내용물을 나타냄
public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    public abstract int getCount();

    // 목록을 표시한다
    public void printList() {
        printList("");
    }
                //메소드 오버로드 : 같은 메소드, 다른 타입 인자
    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
