package hw.ch16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague { //체크박스를 상속받고 아이템 리스너를 담당해 본인이 처리한다.
    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
        // CheckboxGroup group 게스트와 로그인이 그룹으로 둘 중에 하나만 선택되도록 한다.
        //  boolean state true가 들어오면 처음 생성될때 선택된 것으로 생성
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) { 
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다 
    @Override 
    public void setColleagueEnabled(boolean enabled) { 
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // 상태가 변화하면 Mediator에 알린다
        mediator.colleagueChanged(); //아이템 이벤트는 선택된 쪽과 해제된 쪽 양쪽에서 일어난다.
    }
}
