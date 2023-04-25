package hs.hw_middle.ch01_iterator;

public class BookShelf implements Iterable {
  
  public Book Iterator(){
    return new BookShelfIteratorBackward(this);
  }
}
