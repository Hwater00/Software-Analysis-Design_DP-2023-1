package hw.ch05;

import hw.ch05.idcard.IDCardFactoryKimHyeSoo2;

public class Main2 extends Thread {
  public static void main(String[] args) {
      
      new Main2("최승훈").start();
      new Main2("김혜수").start();
      new Main2("박지호").start();
    

      //학번 이름 출력
    System.out.println("20200733 김혜수");

    
  }

  @Override
  public void run() {
    IDCardFactoryKimHyeSoo2 obj = IDCardFactoryKimHyeSoo2.getInstance();
      System.out.println(getName() + ": obj = " + obj);
  }

  public Main2(String name) {
      super(name);
  }
}
