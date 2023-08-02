package ch20.Sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar { 
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata; // 파일의 내용을 담고 있음

    // 생성자 
    public BigChar(char charname) { // 캐릭터 이름이 인자로 들어옴 ex)'1'
        this.charname = charname;
        //파일 다룰 때는 try catch구문
        try {
            String filename = "big" + charname + ".txt"; //bin1.txt

            StringBuilder sb = new StringBuilder(); // String을 계속 구축할 때 사용

            // 확장for(원소: 컬렉션) 
            for (String line: Files.readAllLines(Path.of(filename))) {  //Files.readAllLines 파일로부터 모든 라인을 읽어서 List<String> 반환, Path는 경로를 나타내는 객체
                sb.append(line); // StringBuilder에 쌓인다- 추가
                sb.append("\n"); // 스트링빌더에 한 줄씩 append됨으로 줄 바꿈이 필요하다
            }
            this.fontdata = sb.toString(); //완성된 문자열 리턴하여 fontdata 변수에 메모리로 들어옴

        } catch (IOException e) {
            this.fontdata = charname + "?"; 
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}
