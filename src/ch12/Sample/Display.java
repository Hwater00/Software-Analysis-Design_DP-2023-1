package ch12.Sample;

public abstract class Display {
    public abstract int getColumns();           	// 가로 문자 수를 얻는다
    public abstract int getRows();              	// 세로 행수를 얻는다
    public abstract String getRowText(int row); 	// row행째 문자열을 얻는다, 여러 줄알때 몇 번째 줄

    // 모든 행을 표시한다
    public void show() {
        for (int i = 0; i < getRows(); i++) { //행 수보다 작을때까지 반복
            System.out.println(getRowText(i)); // i번째 행을 출력
        }
    }
}
