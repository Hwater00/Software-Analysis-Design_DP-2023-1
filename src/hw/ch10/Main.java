package hw.ch10;

import java.util.*;

public class Main {


  public static void main(String[] args){

    //학번+ 이름
    System.out.println("20200733 김혜수");

    List<Student> sbook = new ArrayList<>();
    sbook.add(new Student("최승훈", "20201111", 172));
    sbook.add(new Student("김혜수", "20200733", 152));
    sbook.add(new Student("이혜수", "20202222", 162));
    sbook.add(new Student("최혜수", "20203333", 155));
    sbook.add(new Student("박혜수", "20204444", 165));

    sbook.sort((a, b) -> (a).compareTo(b));  //오름차순
    System.out.println("정렬결과(오름차순)");
    System.out.println(sbook);
    

    sbook.sort((a,b) -> (b).compareTo(a));  //내림차순
    System.out.println("정렬결과(내림차순)");
    System.out.println(sbook);
  }


}
