package ch02.practice2;
//위임이란 어떤 클래스가 다른 클래스를 속성으로 가지는 것
// 어댑터(위임을 이용함)
public class PrintBanner extends Print {
  // 어댑티를 갖는 속성
  private Banner banner; //220v

  public PrintBanner(String string){
    this.banner = new Banner(string);
  }

  public void printWeak(){  //12볼트
    banner.showWithParen();  //220볼트로 변환

  }
  public void printStrong(){
    banner.showWithAster();
  }

}
//.showWithAster()=> 인터페이스 예시