package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main{

    public static void main(String[] args) {
      //
    Book b1 = new Book("book1");
    Book b2 = new Book("book2");
    // System.out.println(b1.getName());
      
    //책꽃이 생성
    BookShelf bs1 = new BookShelf(10);
    
    bs1.appendBook(b1);
    // Book result = bs1.getBookAt(0);
    // System.out.println(result.getName());

    bs1.appendBook(b2);
    // Book result2 = bs1.getBookAt(1);
    // System.out.println(result2.getName());

//확장 for 루프를 이용해서 책이름 출력하기
//for(집합원소 타입 : 집합체)
      for(Book book : bs1){
        System.out.println( book.getName());
      }

      //for 루프를 이용해서 책이름 출력하기
      for(int i=0; i <= bs1.getLength()-1 ;i++){
        System.out.println(bs1.getBookFrom(i).getName());
      }

      //iterator를 이용해서 책이름 출력하기
      //iterator 얻기
      System.out.println("<book list using iterator>");
      //BookShelfIterator iterator =bs1.iterator();
      
      
      Iterator<Book> iterator = bs1.iterator();
      //iterator 이용해서 원소 얻어오기
      while( iterator.hasNext() ){ //true일때만 호출
        Book b = iterator.next();
        System.out.println(b.getName());
      }

      //문자열 리스트 다루기
      //컬랙션: List, Set(중복된 원소  x), Map(키와 벨류)
      // ArrrayList 인터페이스를 구현한 클래스
      List<String> slist =new ArrayList<String>();
      slist.add("a");
      slist.add("b");
      slist.add("c");

      // 모든 원소 출력하기

      //1. for 루프 이용하기
      for(int i=0; i<slist.size() ; i++ ){
          System.out.println(slist.get(i));
      }
      //2. 확장 for문 이용하기
      for( String s : slist){
        System.out.println(s);
      }
      //3.iterator 이용하기
      //3.1 iterator 얻기
      Iterator<String> it =slist.iterator();
      //3.2 원소 얻어오기
      while(it.hasNext()){
        System.out.println(it.next());
      }

      // 4. 스트림 이용하기 //메소드 참조
      slist.stream().forEach(System.out::println); //.stream()메소드로 원소를 하나씩 호출 

    }

}