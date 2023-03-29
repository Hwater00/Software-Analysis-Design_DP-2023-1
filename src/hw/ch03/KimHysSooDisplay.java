package hw.ch03;

public class KimHysSooDisplay  extends AbstractDisplay{
  
  private String name;
  private String studentId;
  private int grade;

  KimHysSooDisplay(String name, String studentId, int grade){
    this.name= name;
    this.studentId= studentId;
    this.grade = grade;
  }

  @Override
    public void open() {
        printLine();
        System.out.println("\n 덕성여대 컴퓨터공학전공");
    }

    @Override
    public void print() {
      System.out.println(this.name +"/"+ this.studentId +"/"+ this.grade+"학년");
    }

    @Override
    public void close() {
      System.out.println("템플릿 메소드 패턴 숙제입니다.");
        printLine();
    }

    // open과 close에서 호출되어 "====" 문자열을 표시하는 메소드
    private void printLine() {
        
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        
    }

}
