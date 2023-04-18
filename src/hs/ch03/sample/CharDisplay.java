package hs.ch03.sample;

public class CharDisplay implements InterfaceDisplay{
  private char ch;

  CharDisplay(char ch){
    this.ch = ch;
  }

  @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다 
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시한다
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
    }
    
  // @Override
  // protected void open(){
  //   System.out.println("<<");
  // }
  // @Override
  // protected void print(){
  //     System.out.println(ch);
  // }
  // @Override
  // protected void close(){
  //   System.out.println(">>");
  // }

}
