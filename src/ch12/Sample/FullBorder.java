package ch12.Sample;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display); //부모 생성자 호출
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물 양쪽에 좌우 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수에 상하 장식 문자만큼 더한 것
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {                                             	// 상단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {   //내용물 줄 수+1이면              	// 하단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                    		// 기타
            return "|" + display.getRowText(row - 1) + "|"; //row -1은 내용물 입장에서는 0부터 시작함으로 한 줄씩 뺀다.
        }
    }

    // 문자 ch로 count 수만큼 연속한 문자열을 만든다
    private String makeLine(char ch, int count) { //어떤 문자로, 얼마나 만들지 
    
        StringBuilder line = new StringBuilder(); 
        for (int i = 0; i < count; i++) {
            line.append(ch); //스트링빌더에 문자가 쌓인다.
        }
        return line.toString();
    }
}
