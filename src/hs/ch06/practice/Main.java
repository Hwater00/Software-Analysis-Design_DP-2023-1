package hs.ch06.practice;

import hs.ch06.practice.framework.Manager;
import hs.ch06.practice.framework.Product;

public class Main {
    public static void main(String[] args) {
    Manager manger= new Manager();

    MessageBox char1 = new MessageBox('*'); //" "는 문자열, ''는 문자 구분해서 작성
    manger.register("별 출력",char1);

    Product p1 = manger.create("별 출력");
    p1.use("별 보러가자");

    
  }
}
