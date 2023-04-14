package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");
                // 인자로 문자열이 들어온 것을 리스트로 만들어준다.

    // list: 전략을 가지는 컨텍스트
    // comparator : 전략에 해당
        // 사전순으로 작은 순서(오름차순)
        list.sort( /* 미구현 */ new CompartorAscending() );
        System.out.println(list);

        // 사전순으로 큰 순서(내림차순) 
        list.sort(new ComparatorDesending() );
        System.out.println(list);
    }
}
