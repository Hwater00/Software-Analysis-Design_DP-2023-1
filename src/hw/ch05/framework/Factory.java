package hw.ch05.framework;

public abstract class Factory { 

  //제품을 생산하는 큰 흐름
  public final Product create(String onwer){
    Product p = createProduct(onwer);
    registerProduct(p);
    return p;
  }
  protected abstract Product createProduct(String owner);
  protected abstract void registerProduct(Product product);
}
