package ch01.practice;

public class BookShelf{
 private Book[]  books; //배열 선언 단계
 private int last=0; //책의 마지막 위피를 가지는 변수

  public BookShelf(int maxsize){
    //배열 생성 과정
    this.books =new Book[maxsize]; //배열의 키기 결정_고정
  }

    //책을 꽃는 메소드
  public void  appendBook(Book book){
    this.books[last] = book;
    last++;
  }
    //책을 꺼내오는 메소드
  public Book getBookAt(int index){
    return books[index];

  }

  //책 갯수를 리턴하는 메소드

  
}