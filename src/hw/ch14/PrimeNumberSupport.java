package hw.ch14;

public class PrimeNumberSupport extends Support{
  public PrimeNumberSupport(String name){
    super(name);
  }

  protected boolean resolve(Trouble trouble){
    return isPrimeNumber(trouble.getNumber());
  }
  
  private boolean isPrimeNumber(int number){
    for(int i=2; i<number; i++){
      if(number %i == 0) {
        return false;
      }
    }
    return true;
  }
  
}