package hs.ch03.sample;

public class StringDisplay  extends AbstractDisplay{
  private String string;
  private int width;

  StringDisplay(String string){
    this.string = string;
    this.width= string.getBytes().length;
  }

  protected void open(){
    printLine();
  }
  protected void print(){
    System.out.println("|" + string + "|");
  }
  protected void close(){
    printLine();
  }

  private void printLine(){
    System.out.print("+");
    for(int i=0; i < width; i++){
      System.out.print("=");
    }
    System.out.println("+");
  }
}
