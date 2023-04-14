package hs.ch04.TV;

import hs.ch04.framework.Factory;
import hs.ch04.framework.Product;

public class TVFactory extends Factory {

  @Override
  protected Product createProduct(String modeNos) {
    return new TV(modeNos);
  }

  @Override
  protected void registerProduct(Product p) {
    
    
  }


  
}
