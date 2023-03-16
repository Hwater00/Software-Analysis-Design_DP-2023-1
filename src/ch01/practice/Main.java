package ch01.practice;

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

      //for 루프를 이용해서 책이름 출력하기
      for(int i=0;i<= ;i++){
        System.out.println(bs1.getBookAt(i).getName());
      }
    }
  

}