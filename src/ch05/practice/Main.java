package ch05.practice;

public class Main {
  public static void main(String[] args){
    Singleton x1 = Singleton.getInstance();  //싱글톤 틀래스에 싱글톤 패턴을 적용
    Singleton x2 = Singleton.getInstance();  // new() 대신 인스턴스 호출

    //x1,x2는 같은 인스턴스, 같은 주소 저장
    //인스턴스 생성되었습니다 1번 출력=> 클래스 로딩 할 때 1번 출력
    if(x1 == x2){ 
      System.out.println("x1과 x2는 같은 인스턴스입니다.");
    }else{
      System.out.println("x1과 x2는 다른 인스턴스입니다.");
    }


  }
}
