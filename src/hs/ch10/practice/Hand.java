package hs.ch10.practice;

public enum Hand{
//1. enum  클래스임을 표시하는 법-> class를 쓰지 않고 class 자리에 enum이라고 작성
  //상수
  ROCK("바위",0), // ;가 아닌 ,를 써서 상수 표현
  SCISSORS("가위",1), 
  PAPER("보",2);

  //필드  
// String name; 
private String name;
// handvalue;
private int handvalue;

   // hands;
//배열 정적-static
private static  Hand[] hands={
  ROCK, SCISSORS, PAPER
};

private Hand(String name, int handvalue) { //생성지
  this.name = name;
  this.handvalue = handvalue;
}

}