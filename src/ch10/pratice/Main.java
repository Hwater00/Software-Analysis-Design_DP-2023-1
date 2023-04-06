package ch10.pratice;

public class Main {
  public static void main(String[] argf) {
    
    // 바위
    Hand h1 = Hand.ROCK;
    System.out.println(h1.toString());

    //가위
    Hand h2 = Hand.getHand(2);
    System.out.println(h2.toString());

    // h1이 h2를 이기는지 확인
    if ( h1.isStrongerThan(h2)){
      System.out.println("h1이 이김");
    }else if(h1.isWeakerThan(h2) ){ //h2.isStrongerThan(h1)
      System.out.println("h2가 이김");
    }else{
      System.out.println("무승부");
    }

   //WinningStrategy 테스트
    WinningStrategy ws1 = new WinningStrategy(100);
    ws1.study(false);
    Hand wsh1 = ws1.nextHand();
    System.out.println(wsh1);

    ws1.study(true);
    wsh1 = ws1.nextHand();
    System.out.println(wsh1);


  }
}
