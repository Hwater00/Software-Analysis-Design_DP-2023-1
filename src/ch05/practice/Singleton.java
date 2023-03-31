package ch05.practice;
//싱글턴 패턴을 적용

public class Singleton {
  // 3: Singleton 객체 미리 생성 - 클래스 로드 시 미리 생성
  private static Singleton singleton = new Singleton(); 

  // 1: 생성자를 private으로 한다.
  private Singleton(){
    System.out.println("인스턴스가 생성되었습니다.");
  }

  // 2: 객체를 얻어가는 메소드를 구현
  public static Singleton getInstance(){
    return singleton; //클래스 만들어질 때 같이 생성 static
  }



}

// enum Month{
//   January, Feburary, March, April, May;
// }

// Month.January;
