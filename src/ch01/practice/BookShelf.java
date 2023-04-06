package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> { ///BookShelf는 반복이 가능한데 각 원소의 타입은 책이다.

  private Book[]  books; //배열 선언 단계
 //ArrayList 크기 제한 없이
  private List<Book> books = new ArrayList();
  //ArrayList 사용 후 배열관련 크기 .add() .get()으로 변경하기 

  private int last=0; //책의 마지막 위치= 책의 갯수를 가지는 변수

  public BookShelf(int maxsize){
    //배열 생성 과정
     this.books =new Book[maxsize]; //배열의 크기 결정_고정
    
  }

    //책을 꽃는 메소드
  public void  appendBook(Book book){
    this.books[last] = book;
    last++;
  }
    //책을 꺼내오는 메소드
  // public Book getBookAt(int index){
  public Book getBookFrom(int index){
    return books[index];

  }

  //책 갯수를 리턴하는 메소드
  public int getLength(){
    return last;
  }

  // 집합체마다 iterator 반환하는 메소드
  // public BookShelfIterator iterator(){ //자식 타입 선언
  @Override
  public Iterator<Book> iterator(){  //부모타입 선언
    return new BookShelfIterator(this); //현재 책꽃이와 iterator가 연결됨
    // return new BookShelfIteratorBackward(this);
  }

}