package ch16.Sample;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague { //텍스트필드를 상소잗고, 콜리그와 반응하는 리스너 역할을 자체에서 처리한다.
    
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다. 중재자가 지시할때
     //텍스트필드에서 상속받은 메소드
    @Override
    public void setColleagueEnabled(boolean enabled) { 
        setEnabled(enabled);
        // 활성/비활성에 맞게 배경색을 변경한다
        setBackground(enabled ? Color.white : Color.lightGray); 
        // ? :은 첫번째인자가 참이면? 두번째 인자는 참일때  결과값: 세번째 인자는 거짓일때 결과값
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 변화했으면 Mediator에 알린다
        mediator.colleagueChanged();  //글자를 입력할 때마다 중재자에게 변했음을 알려준다.
    }
}
