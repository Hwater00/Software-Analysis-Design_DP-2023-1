package hw.ch12;

public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) { //문자열이 1줄인 것만 가능
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
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
