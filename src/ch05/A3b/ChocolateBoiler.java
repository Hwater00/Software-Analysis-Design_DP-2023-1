package ch05.A3b;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler(){
    empty=true;
    boiled= false;
  }

  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }return uniqueInstance;
  }
}
