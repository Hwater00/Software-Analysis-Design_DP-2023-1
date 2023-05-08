package ch12.A2;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    // 표시 문자열 저장 장소
    private List<String> body = new ArrayList<>(); //여러 층짜리 문자열 가능
    // 표시 문자열 최대 문자 수를 기억하는 변수 
    private int columns = 0;

    // 문자열 추가 
    public void add(String msg) {
        body.add(msg); //msg는 넣는 문자열

        if (columns < msg.length()) { //현재 넣는 문자열이 컬럼수보다 큰 지 검사한다.
            // 최대 문자 수 갱신
            columns = msg.length();
        }

        updatePadding();

    }

    @Override
    public int getColumns() {
        return columns; 
    }

    @Override
    public int getRows() {
        return body.size(); // 문자열의 갯수
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    // 표시 문자열 오른쪽 끝에 채울 공백을 필요에 따라 늘린다
    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row); //지금 꺼내온 것

            int padding = columns - line.length(); //가징 긴 길이 - 자신의 길이 = 채워야 할 빈 칸 갯수

            if (padding > 0) { // 빈 칸을 채워야 하면
                body.set(row, line + spaces(padding)); //빈 칸을 채워서 다시 넣는다.
            }
        }
    }

    // count 수만큼의 공백을 만든다 
    private String spaces(int count) {
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }

        return spaces.toString();

    }
}
