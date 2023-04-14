package hs.ch04.idcard;

import hs.ch04.framework.Factory;
import hs.ch04.framework.Product;

public class IDCardFactory extends Factory {

  protected Product createProduct(String owner){
    return new IDCard(owner);
  } 
  protected void registerProduct(Product p){

  }
  
}
