package ch15.Sample;

import ch15.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        // 퍼사드를 이용
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
        PageMaker.makeWelcomePage("202020733@duksung.ac.kr", "welcome2.html");
    }
}
