package ch10.A4b;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

//람다식을 이용함
// Funtional interface : 메소드가 한 개만 선언되어 있는 인터페이스 ,메소드가 하나만 있어서 인터페이스도 함수로 본다는 의미
// Funtional interface 들어갈 자리에 람다식을 넣을 수 있다.
// Compartor 인터페이스 functional 인터페이스
        // 사전순으로 작은 순서
        list.sort((a, b) -> a.compareTo(b)); //compare 메소그 자디를 제공한 것과 같음
        System.out.println(list);

        // 사전식 순으로 큰 순서
        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
