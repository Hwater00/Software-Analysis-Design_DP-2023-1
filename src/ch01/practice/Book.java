package ch01.practice;

public class Book{
//속성
private String name = ""; //책 제목

  //생성자
  public Book(String name) {
    this.name = name;
  }
  //매소드
  public String getName() {
    return name;
  }

}