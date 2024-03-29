package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
      
      //학번,이름 출력
      System.out.println("20200733,김혜수");
      Factory factory = new CarFactory();
      Product car1 = factory.create("김혜수");
      Product car2 = factory.create("그랜저");
      Product car3 = factory.create("소나타");
      Product car4 = factory.create("캐스퍼");
      car1.use();
      car2.use();
      car3.use();
      car4.use();

      //모델명 리스트
      System.out.println("\n<모델명 리스트>");
      factory.printAlModelNames();
  }
}
