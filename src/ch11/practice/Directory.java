package ch11.practice;

import java.util.ArrayList;
import java.util.List;

// composite(그릇)을 나타내는 클래스
public class Directory extends Entry {
    private String name;

    // 자기 내용물 리스트를 관리하는 변수
    private List<Entry> directory = new ArrayList<>(); //Entry : 부모 타입

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    //자기 내용물들의 getSize()를 호출함
    public int getSize() { 
        int size = 0;
//root 호출
        //확장 for 문
        for (Entry entry: directory) { //디렉토리에 담겨있는 내용물을 하나씩 꺼낸다
            size += entry.getSize();  // 재귀적 호출
        }
        
        return size; //아래에 있는 사이즈를 총 더한 값
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); //내 것 출력

        for (Entry entry: directory) { // 내 밑의 것 출력, 부모 타입 Entry로 파일, 디렉토리 가능
            entry.printList(prefix + "/" + name); //재귀적 호출
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다, Entry 부모 타입으로 파일,폴더 모두 가능
    public Entry add(Entry entry) { 
        directory.add(entry);
        return this;
    }
}
