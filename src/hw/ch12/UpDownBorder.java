package hw.ch12;

public class UpDownBorder extends Border { //장식자Border 상속
    private char borderChar;  // 장식 문자 
    int num;

    // 내용물이 될 Display와 장식 문자를 지정
    public UpDownBorder(Display display, char ch, int num) {
        super(display);
        this.borderChar = ch;
        this.num = num;
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물의 문자 수와 같다 
        return display.getColumns();
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수에 상하 장식 문자 수를 더한 것 
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            // 맨 위와 맨 아래는 장식 문자만의 행
            return makeLine(borderChar, getColumns());
        } else {
            // 내용물의 행(맨 위 행수만큼 행 번호를 줄인다
            return display.getRowText(row - 1); //내용물을 준다. 0번부터 시작히기 때문에 내용물은 1을 뺀 값이다.
        }
    }

    // 문자 ch로 count 수만큼 연속한 문자열을 만든다
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();

        for (int i = 0; i <num ; i++) {
            line.append('*');
        }

        int count1= count-num-num;
        for (int i = 0; i < count1; i++) {
            line.append(ch);
        }

        for (int i = 0; i <num ; i++) {
            line.append('*');
        }
        return line.toString();
    }
}
