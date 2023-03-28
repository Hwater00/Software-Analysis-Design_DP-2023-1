package ch02.practice1;

// 어댑터 (상속을 이용함)
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        //생성자 안에서 super는 부모 생성자
        super(string); //super는 부모를 의미
        
    }
    
    
    @Override
    public void printWeak() { //12볼트
        showWithParen(); // 220볼트 (실제 일은 Banner가 한다.)
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
