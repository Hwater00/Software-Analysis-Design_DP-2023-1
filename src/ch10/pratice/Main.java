package ch10.pratice;

public class Main {
  public static void main(String[] args) {

/*  
    // 바위
    Hand h1 = Hand.SCISSORS;
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
    WinningStrategy ws1 = new WinningStrategy(100); //seed란?
    ws1.study(false);
    Hand wsh1 = ws1.nextHand();
    System.out.println(wsh1);

    ws1.study(true);
    wsh1 = ws1.nextHand();
    System.out.println(wsh1); 
*/

  //게임 진행

    //1. 플레이어 생성
    Player p1 = new Player("김혜수", new ProbStrategy(100));
    Player p2 = new Player("박보검",new WinningStrategy(200));
      
    p2.setStrategy(new ProbStrategy(300)); //전략을 동적으로 교체함

    for(int i=0; i< 1000; i++){
    
      //2. 게임 시작
      Hand h1 = p1.nextHand();
      Hand h2 = p2.nextHand();

      if(h1.isStrongerThan(h2)){
        System.out.println("winner: "+ p1);
          p1.win();
          p2.lose();
      }else if(h1.isWeakerThan(h2)){
        System.out.println("winner: "+p2);
          p1.lose();
          p2.win();
      }else{
        System.out.println("Even..");
        p1.even();
        p2.even();
      }

    }

  //게임 종료
  System.out.println("Total Result: ");
  System.out.println(p1);
  System.out.println(p2);

  }
}
