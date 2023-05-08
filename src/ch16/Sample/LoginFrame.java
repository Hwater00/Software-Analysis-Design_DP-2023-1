package ch16.Sample;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//카운셀러(중재자)
public class LoginFrame extends Frame implements ActionListener, Mediator { 
    //프레임으로 창 제작을 상속받고 중재자 역할과 액션리스너로 버튼이 눌러졌을 때 역할
    
    //프레임 구성요소를 CUI컨트롤이라고 한다. 
    private ColleagueCheckbox checkGuest; //체크박스를 위한 속성이 선언
    private ColleagueCheckbox checkLogin;

    private ColleagueTextField textUser; //텍스트필드를 위한 속성이 선언
    private ColleagueTextField textPass;
    
    private ColleagueButton buttonOk; //버튼을 위한 속성이 선언
    private ColleagueButton buttonCancel;


    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title); //부모 생성자를 호출, 반드시 처음에 나와야 함.
        //super이 없으면 부모의 인자 없는 생성자가 호출

        // 배경색을 설정한다
        setBackground(Color.lightGray); //컬러크래스에 있는 상수 중 회색

        // 레이아웃 매니저를 사용해 4×2 그리드를 만든다.  4행 2열 테이블 형태
        setLayout(new GridLayout(4, 2)); // setLayout으로 지정

        // Colleague를 생성한다 
        createColleagues();

        // 배치한다 add로 추가
        //2개 Label 6개 Colleague
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:")); //직접 만듦
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        // 활성/비활성 초기 설정을 한다
        colleagueChanged();

        // 표시한다 
        pack();
        setVisible(true);
    }

    // Colleague를 생성한다 
    @Override
    public void createColleagues() { //컴포넌트들을 추가하는 역할
        // CheckBox
        CheckboxGroup g = new CheckboxGroup(); //같은 그룹이라서 둘 중에 하나만 선택
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*'); //비밀번호 입력 시 별표로 보이도록 

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다 
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest); //같은 경우는 발생한 곳에서 동작한다.
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this); 
        buttonCancel.addActionListener(this); //this는 로그인프레임 , actionPerformed를 가진다.
    }

    // Colleage의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() { 
        //실제 중재하는 역할을 한다.
        if (checkGuest.getState()) { //Guest 체크박스가 눌러졌으면.. 
            // 게스트 로그인 
            textUser.setColleagueEnabled(false); //비활성화해라
            textPass.setColleagueEnabled(false); //비활성화해라
            buttonOk.setColleagueEnabled(true); //활성화해라
        } else { //Login 체크박스가 눌러졌으면.. 
            // 사용자 로그인 
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // textUser 또는 textPass의 변경이 있다 
    // 각 Colleage의 활성/비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() > 0) { //텍스트를 얻어옴.길이 => username 칸에 문자열이 입력되어 있으면
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) { //passwoed 칸에 문자열이 입력되어 있으면
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
