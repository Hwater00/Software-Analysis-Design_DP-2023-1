package hs.ch10.practice;

public interface Strategy { //1.인터페이스임을 표현 class가 아닌 그 자리에 interface 작성
  public abstract Hand nextHand();
  public abstract void study(boolean win); 
  //인처페이스는 {} 구현 부분이 없다
  //static하면 고정되니깐 X
}
