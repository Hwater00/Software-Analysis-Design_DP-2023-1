package hw.ch17;

public class NamePrintObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) { //관찰 대상을 받음
      for(int i=0; i<generator.getNumber(); i++){
        System.out.print("김혜수");
      }
      System.out.println("");
      try {
          Thread.sleep(100);
      } catch (InterruptedException e) {
      }
  }
}
