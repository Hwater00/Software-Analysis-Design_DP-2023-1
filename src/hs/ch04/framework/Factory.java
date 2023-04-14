package hs.ch04.framework;

public abstract class Factory {
  public final Product create(String onwer){ //public final Product 순서  //함수이름 (타입 변수명)
      Product p = createProduct(onwer); //타입 작성 x
      registerProduct(p);
      return p;
  }
  protected abstract Product  createProduct(String owner); //함수이름 (타입 변수명)
  protected abstract void registerProduct(Product p); //함수이름 (타입 변수명)

}
