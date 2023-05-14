package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator{
  private Random random = new Random(); 	// 난수 생성기 
  //number에 새로운 값이 들어오면 상태가 바뀜
  private int number;                   		// 현재 수 (이 객체의 상태)


  // 수를 취득한다 
  @Override
  public int getNumber() {
      return number;
  }

  // 수를 생성한다 
  @Override
  public void execute() {
      for (int i = 0; i < 20; i++) {
          number = random.nextInt(100)+1; //1부터 100사이 임의의 숫자 100개
          if(isPrimeNumber(number)== true){
            notifyObservers(); //관찰자에게 통지
          }
      }
  }

  public boolean isPrimeNumber(int x){
    for(int i=2; i<x; i++){
      if(x%i == 0) {
        return false;
      }
    }
    return true;
  }

}
