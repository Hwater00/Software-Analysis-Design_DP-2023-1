package hs.ch04.idcard;

import hs.ch04.framework.Product;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner){
    System.out.println(owner + "의 카드를 만듭니다");
    this.owner = owner;
  }

  public void use(){
    System.out.println(this+"을 사용합니다.");
  }

  public String getOwner(){
    return owner;
  }

}
