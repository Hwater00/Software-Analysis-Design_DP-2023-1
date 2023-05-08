package ch12.Sample;

public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) { //한 줄이라서 0이 아닌 것은 범위를 벗어난 예외처리
            throw new IndexOutOfBoundsException();
        }
        return string; //0일때만 string 리턴
    }
}
