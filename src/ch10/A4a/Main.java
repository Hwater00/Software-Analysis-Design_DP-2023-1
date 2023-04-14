package ch10.A4a;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

//자동으로 익명의 내부 클래스를 만드는 방법
        // 사전순으로 작은 순서
        list.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(list);

        // 사전순으로 큰 순서
        list.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println(list);
    }
}
