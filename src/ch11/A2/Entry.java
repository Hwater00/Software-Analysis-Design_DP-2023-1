package ch11.A2;

public abstract class Entry {
    //자기 부모를 가리킴
    private Entry parent;

    // 부모를 설정한다
    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여 목록을 표시한다
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    //A2 //전체 경로를 가져온다 
    public String getFullName() {

        //앞쪽으로 넣기 위한 객체로 문자열을 계속 변경할 수 있는 StringBuilder 객체
        StringBuilder fullname = new StringBuilder();  //문자열 구축을 위한 객체

        Entry entry = this; //entry가 현재 객체를  가리키게 함

        do {
            fullname.insert(0, entry.getName()); //offset:0 는 현재 객체의 이름을 맨 앞에 삽입함
            fullname.insert(0, "/"); 
            //entry 변수는 현재 노드를 가리킴
            entry = entry.parent; //현재 위치(포인터)를 부모로 옮긴다.
        } while (entry != null); //부모가 더 이상 없으면 루프를 뻐져나옴

        return fullname.toString(); //최종 문자열을 얻음
    }
}
