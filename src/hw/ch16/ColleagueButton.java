package hw.ch16;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague { //버튼을 상속받고 콜리그 역할을 한다
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption); //부모 생성자를 호출
    }

    // Mediator를 설정한다 
    //리스너 가따로 있다.
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled); //부모인 Button으로부터 상속받은 메소드
                             //true면 활성화
    }
}
