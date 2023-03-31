package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_KimHyeSoo extends Product {
  String modelName;

  Car_KimHyeSoo(String modelName){
    this.modelName = modelName;

  }

  // 모델명 xxx인 car를 사용합니다.라는 메시지를 출력
  public void use(){
    System.out.println("모델명 "+this.modelName+"인 car를 사용합니다.");
  }

  //자신의 모델명을 반환
  public String  getModelName(){
    return modelName;
  };


}
