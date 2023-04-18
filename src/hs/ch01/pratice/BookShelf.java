package hs.ch01.pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch01.practice.Book;

public class BookShelf implements Iterable<Book> {
  
  private List<Book> books = new ArrayList<>();
  private int last =0;

  public void appendBook(Book book){
    this.books.add(last, book);
    last++;
  }

  public Book getBookFrom(int index){
    return this.books.get(index);
  }
  public int getLength(){
    return last;
  }
  @Override
  public Iterator<Book> iterator(){
    return new BookShelfIterator(this);
  }

}
