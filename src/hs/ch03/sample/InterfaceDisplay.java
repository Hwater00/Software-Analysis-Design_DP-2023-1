package hs.ch03.sample;

public interface InterfaceDisplay {
  public default void display(int times){
    open();
    for(int i=0; i<times; i++){
      print();
    }
    close();
  }
  public abstract void open();
  public void print();
  public void close();
  
}
