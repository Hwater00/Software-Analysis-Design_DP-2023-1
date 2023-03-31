package hw.ch04.car;


import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;


public class CarFactory extends Factory {
  Vector modelNames = new Vector<>();
  

  //입력된 모델명의 car를 생성해서 반환한다.
  protected Product createProduct(String modelName){
    return new Car_KimHyeSoo(modelName);
  }

  //생성된 모델명을 modelNames에 저장
  protected void registerProduct(Product product){
    modelNames.add(product.getModelName());
  }

  //modelNames에 저장되어 있는 모델 이름을 하나씩 출력
  public void printAlModelNames(){

  // iterator hasNext(),next()메소드
    Iterator iter = modelNames.iterator();
    while(iter.hasNext()){//다음값이 있는지 체크
      System.out.println(iter.next()); //값 출력
    }
  }
}
