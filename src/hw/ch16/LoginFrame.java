package hw.ch16;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JOptionPane;

//카운셀러(중재자)
public class LoginFrame extends Frame implements ActionListener, Mediator { 
    //프레임으로 창 제작을 상속받고 중재자 역할과 액션리스너로 버튼이 눌러졌을 때 역할
    
    //프레임 구성요소를 CUI컨트롤이라고 한다. 
    private ColleagueCheckbox checkGuest; //체크박스를 위한 속성이 선언
    private ColleagueCheckbox checkLogin;
    //추가 
    private ColleagueCheckbox checkMember;
    

    private ColleagueTextField textUser; //텍스트필드를 위한 속성이 선언
    private ColleagueTextField textPass;
    //추가 주민등록번호
    private ColleagueTextField textMember; 


    
    private ColleagueButton buttonOk; //버튼을 위한 속성이 선언
    private ColleagueButton buttonCancel;


    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title); //부모 생성자를 호출, 반드시 처음에 나와야 함.
        //super이 없으면 부모의 인자 없는 생성자가 호출

        // 배경색을 설정한다
        setBackground(Color.lightGray); //컬러크래스에 있는 상수 중 회색

        // 레이아웃 매니저를 사용해 5×3 그리드를 만든다.  4행 2열 테이블 형태
        setLayout(new GridLayout(5, 3)); // setLayout으로 지정

        // Colleague를 생성한다 
        createColleagues();

        
        add(checkGuest);
        add(checkLogin);
        add(checkMember);

        add(new Label("Username:")); //직접 만듦
        add(textUser);
        add(new Label("  ")); //빈 문자열
        add(new Label("Password:"));
        add(textPass);
        add(new Label(" "));
        add(new Label("주민등록번호:"));
        add(textMember);
        add(new Label("        "));
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
        checkMember = new ColleagueCheckbox("Member", g, false);

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*'); //비밀번호 입력 시 별표로 보이도록 
        textMember = new ColleagueTextField("", 13);
    
    
        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다 
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        textMember.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest); //같은 경우는 발생한 곳에서 동작한다.
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textMember.addTextListener(textMember);
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
            textMember.setColleagueEnabled(false); //비활성화해라
            buttonOk.setColleagueEnabled(false); //비활성화해라
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
                textMember.setColleagueEnabled(true);
                //추가 주민등록번호 조건
                for(int i=0; i<textMember.getText().length();i++){
                    char tmp = textMember.getText().charAt(i);
                    int num=textMember.getText().length();

                    if (Character.isDigit(tmp) == true) { 
                        if(num ==13){
                            buttonOk.setColleagueEnabled(true);}
                        else{
                            buttonOk.setColleagueEnabled(false);
                        }
                    }else {
                        JOptionPane.showMessageDialog(null, "문자를 입력하지 말아주세요");
                        
                        String s=textMember.getText().substring(0,i);
                        textMember.setText(s);
                        textMember.setCaretPosition(s.length());
                        buttonOk.setColleagueEnabled(false);
                    }
                }
        
            }else {
                buttonOk.setColleagueEnabled(false);
                textMember.setColleagueEnabled(false);
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
