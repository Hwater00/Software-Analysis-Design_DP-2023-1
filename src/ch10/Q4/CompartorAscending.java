package ch10.Q4;

import java.util.Comparator;

public class CompartorAscending implements Comparator{

  @Override
  //오름차순으로 정렬되도록 반환값을 리턴해야함
  public int compare(Object a, Object b) { //Comparable 인터페이스는 Object로 선언되어 있어 자식에서 마음대로 수정 불가
    //반환값: 양수, 음수 , 0
    //정렬 주체(list)는 양수가 리턴되면 a와 b의 위치를 서로 바꾼다.
    //오름차순: 작은 것이 앞에 옴
    //큰 게 앞에 오면 양수를 리턴해야 함

    //크기 비교
    return ((String)a).compareTo((String) b); // . 이 우선순위가 가장 높다. -> a를 문자열로 먼저 바꾸기 위해 괄호()
    // a의 문자코드 -b의 문자코드
    // a가 작은 경우에는 음수가 리턴됨
    // a가 큰 경우에는 양수가 리턴됨=> a와 b의 위치를 바꾼다 => 오름차순

  }
  
}
