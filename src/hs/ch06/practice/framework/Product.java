package hs.ch06.practice.framework;

public interface Product  extends Cloneable {
  public abstract void use(String s);
  public abstract Product createCopy(); //복제->자기자신을 반환
}
