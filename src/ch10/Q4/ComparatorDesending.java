package ch10.Q4;

import java.util.Comparator;

//public class ComparatorDesending implements Comparator { //Comparable 인터페이스는 Object로 선언되어 있어 자식에서 마음대로 수정 불가
public class ComparatorDesending implements Comparator<String> { //<String>선언하여 타입 변경

  @Override
  //public int compare(Object a, Object b) {
  public int compare(String a, String b) {
    // return ((String) b).compareTo((String)a); 
    return  b.compareTo(a);
    //b가 클 때 양수가 나온다.
    //b를 a와 위치를 바꾼다.

  }
  
}
