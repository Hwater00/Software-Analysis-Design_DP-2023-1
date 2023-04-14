package hs.ch04.TV;

import hs.ch04.framework.Product;

public class TV extends Product {
  String modeNo;

  TV(String modeNo){
  this.modeNo = modeNo;   //생성자에 return 없음
  System.out.println(modeNo + "티비를 틉니다");
  }
  public void use(){

  }

  public String getModeNo() {
    return this.modeNo;
  }
}
