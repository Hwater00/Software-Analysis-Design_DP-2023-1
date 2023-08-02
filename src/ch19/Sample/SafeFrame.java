package ch19.Sample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context { //버튼 눌렀을 떄 구현 ActionListener
    // GUI를 위한 컴포넌트 생성
    private TextField textClock = new TextField(60);		// 현재 시간 표시
    
    private TextArea textScreen = new TextArea(10, 60);	// 경비 센터 출력
    
    private Button buttonUse = new Button("금고 사용");	// 금고 사용 버튼
    private Button buttonAlarm = new Button("비상벨");	// 비상벨 버튼
    private Button buttonPhone = new Button("일반 통화");	// 일반 통화 버튼
    private Button buttonExit = new Button("종료");		// 종료 버튼

    // 현재 상태 가짐(부모 타입으로 선언됨) -> 상태 바꿀 수 있음
    private State state = DayState.getInstance();		

    // 생성자 
    public SafeFrame(String title) {
        super(title);

        setBackground(Color.lightGray);

        setLayout(new BorderLayout());

        // textClock 배치 
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false); //setEditable(false)로 수정이 안 되도록함

        // textScreen 배치 
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        // 패널에 버튼 저장
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        
        // 그 패널을 배치 
        add(panel, BorderLayout.SOUTH);
        
        // 화면 표시 
        pack();
        setVisible(true);
        
        //연습문제19-1
        //buttonUse.addActionListener((e , actionPerformed 인자)->{ state.doUse(this) actionPerformed()가 하는 일}); 
// functional interface 객체가 들어갈 자리에는 람다식을 넣을 수 있다.
        // 리스너 설정 
        // functional interface로 메서드가 닥 하나만 선언되어 있는 인터페이스= 액션리스너, 액션포펀드 1개만 있기 때문
        buttonUse.addActionListener(this);//ActionListener 객체의 actionPerformed()가 호출됨
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 버튼이 눌리면 여기로 온다
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        //getSource 이벤트 발생한 곳을 알 수 있음
        if (e.getSource() == buttonUse) {		// 금고 사용 버튼
            state.doUse(this); //현재 상태 객체의 doUse()를 호출함
        } else if (e.getSource() == buttonAlarm) {	// 비상벨 버튼 
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {	// 일반 통화 버튼  
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {	// 종료 버튼 
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 시간 설정 
    @Override
    public void setClock(int hour) { //메인에서 setClock호출
        String clockstring = String.format("현재 시간은 %02d:00", hour); //%d 뒤의 나오는 값을 매핑해줌, 02는 2칸을 의미
        
        System.out.println(clockstring);
        textClock.setText(clockstring);
        
        state.doClock(this, hour);//현재 상태를 알려줌, 상태에게 위임
    }

    // 상태 변화 
    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서" + state + "으로 상태가 변화했습니다.");
        this.state = state; //현재 상태를 바꿔줌
    }

    // 경비 센터 경비원 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n"); //텍스트 스트린에 다음줄에 출력
    }

    // 경비 센터 기록 
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
