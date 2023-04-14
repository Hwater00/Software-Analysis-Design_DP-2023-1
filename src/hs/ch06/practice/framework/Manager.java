package hs.ch06.practice.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager { 

  Product p;
  //showcase필드 
  //HashMap<String, Producr>;
  Map<String, Product> showcase = new HashMap<>();
  //Map의 get()메소드, put()메소드

  public void register(String name, Product prototype){
    showcase.put(name, prototype);
  }
  public Product create(String Prototype){ //클래스와 관계를 갖지 않게
    //문자열을 이용해 쇼케이스에서 문자열을 찾아온다.
    Product p = showcase.get(Prototype);
    return p.createCopy(); 
  }


}
