package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryKimHyeSoo1 extends Factory {
  
  //3. 객체 미리 생성
  private static IDCardFactoryKimHyeSoo1 idcardFactoryKimHyeSoo = new IDCardFactoryKimHyeSoo1();

  //1.생성자를 private으로 한다.
  private IDCardFactoryKimHyeSoo1(){
    
  }

  //2.객체를 얻어가는 메소드를 구현한다
  public static IDCardFactoryKimHyeSoo1 getInstance(){
    return idcardFactoryKimHyeSoo;
  }

  //Factory 구현
  @Override
  protected Product createProduct(String owner) {
      return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
      System.out.println(product + "을 등록했습니다.");
  }

}
