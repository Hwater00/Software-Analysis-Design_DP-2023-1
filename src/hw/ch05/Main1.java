package hw.ch05;

import ch04.A2.framework.Factory;
import hw.ch05.idcard.IDCardFactoryKimHyeSoo1;

public class Main1 {
  public static void main(String[] args){
    IDCardFactoryKimHyeSoo1 factory1 = IDCardFactoryKimHyeSoo1.getInstance();
    IDCardFactoryKimHyeSoo1 factory2 = IDCardFactoryKimHyeSoo1.getInstance();

    //학번 이름 출력
    System.out.println("20200733 김혜수");

    if(factory1 == factory2){ 
      System.out.println("x1과 x2는 같은 인스턴스입니다.");
    }else{
      System.out.println("x1과 x2는 다른 인스턴스입니다.");
    }




  }
}
