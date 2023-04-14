package hs.ch06.practice;

import hs.ch06.practice.framework.Product;

public class MessageBox implements Product {
  //Product decochar; X 문자 타입으로 선언 
  private char decochar;

  public MessageBox(char decochar) {
    this.decochar = decochar;
}

  public void use(String s){ //s는 둘러싸는 대상이 되는 문자열
    //문자열을 둘러싸기 위해서는  1+길이+1;
    int decolen= 1+ s.length() +1; //한글이라서 다를때는?

    for (int i=0; i<decolen; i++){
      System.out.print(decochar); //print와 println구별
    }
    System.out.println();
    System.out.println(decochar + s + decochar); 


    for (int i = 0; i < decolen; i++) {
        System.out.print(decochar);
    }
    System.out.println();


  }

  public Product createCopy(){
    //구현했는지 확인 if문 X try catch 사용
    Product p = null; //null은 객체가 없다
    try{
      p= (Product)clone();
    }catch (CloneNotSupportedException e){

    }
    return p;
  }
}
