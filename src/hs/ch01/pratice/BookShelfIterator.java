package hs.ch01.pratice;

import java.util.Iterator;

import ch01.practice.Book;

public class BookShelfIterator implements Iterator<Book> {
  BookShelf bookshelf;
  int index;

  public BookShelfIterator(BookShelf bookshelf){
    this.bookshelf = bookshelf;
    this.index =0 ;
  }
  
  public boolean hasNext(){
    if(index<this.bookshelf.getLength()){
      return true;
    }else return false;
  }

  public Book next(){
    Book book = this.bookshelf.getBookFrom(index);
    index++;
    return book;
  }

}
