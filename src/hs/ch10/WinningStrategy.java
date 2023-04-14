package hs.ch10;

import java.util.Random;

import hs.ch10.practice.Hand;
import hs.ch10.practice.Strategy;

public class WinningStrategy implements Strategy {
  Hand prevHand;
  boolean won;
  Random random; //앞 Random 클래스 타입 뒤 random은 변수

  public Hand nextHand(){
    if(!won){
      prevHand= Hand.getHand(random.nextInt(3));
    }
    return prevHand;

  }
  public void study(boolean win){
    won=win;
  }

}
