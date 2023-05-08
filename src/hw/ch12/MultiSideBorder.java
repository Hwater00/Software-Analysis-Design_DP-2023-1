package hw.ch12;

public class MultiSideBorder extends Border{
  private char borderChar;
  int num;

  public MultiSideBorder(Display display,char ch, int num){
    super(display);
    this.borderChar=ch;
    this.num= num;

  }

  @Override
  public int getColumns() {
      return num + display.getColumns() + num;
  }

  @Override
    public int getRows() {
        return display.getRows();
    }
  
    @Override
    public String getRowText(int row) {
      StringBuilder spaces = new StringBuilder();
      
      for (int i = 0; i <num ; i++) {
          spaces.append(borderChar);
      }
      return spaces+display.getRowText(row)+spaces;
      
    }
  
}
