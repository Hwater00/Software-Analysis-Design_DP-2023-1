package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args){
    //신분증 직접 생성
    Product id01 = new IDCard("khs");
    id01.use();
    
    //신분증 공장을 통해 생성
    Factory f = new  IDCardFactory(); ///f는 공장
    Product id02 = f.create("khs"); //공장에서 신분증 얻는 과정
    id02.use();
  }
}
