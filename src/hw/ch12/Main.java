package hw.ch12;

public class Main {
  public static void main(String[] args) {
    MultiStringDisplay md = new MultiStringDisplay();

    md.add("학번: 1234567");
    md.add("이름: 김혜수");
    md.add("핸드폰 번호: 010-6559-7648");
    // md.show();
    // Display d1 = new MultiSideBorder(md, '%', 1);
    // d1.show();

    System.out.println("20200733, 김혜수");

    Display d1 = 
    new UpDownBorder  
      (new MultiSideBorder(
            new FullBorder(
              new SideBorder(md, '%')
            )
        ,'*',3
      ),'=',3
    );
    d1.show();;
    
  }
}
