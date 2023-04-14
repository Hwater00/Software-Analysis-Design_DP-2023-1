package hs.ch04;

import hs.ch04.TV.TVFactory;
import hs.ch04.framework.Factory;
import hs.ch04.framework.Product;
import hs.ch04.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args){
    
    Factory f = new  IDCardFactory(); ///f는 공장
    Product id02 = f.create("khs"); // f. createProduct()가 아니라 f.create()
    id02.use();

    Factory t = new TVFactory();
    Product tv01 = t.create("tvN");
    tv01.use();
  }
}
