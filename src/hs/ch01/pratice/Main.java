package hs.ch01.pratice;

import java.util.Iterator;

import ch01.practice.Book;

public class Main {
  public static void main(String[] args){
    Book b1 = new Book("D4");
    BookShelf bs1 = new BookShelf();
    bs1.appendBook(b1);
    bs1.appendBook(new Book("D3"));

    Iterator<Book> it = bs1.iterator();
    
    while(it.hasNext()){
    System.out.println( it.next().getName());
    }

    Student s1 = new Student("khs", 01);
    Attendance at1 = new Attendance(3);
    at1.appendStudent(s1);
    at1.appendStudent(new Student("csh", 02));
    at1.appendStudent(new Student("lcs", 03));

    for(Student s : at1){
      System.out.println(s.getName());
    }



    

    
  }
}
