package hw.ch14;

public class Main {
  public static void main(String[] args) {

    //해결자 생성
    Support support = new PrimeNumberSupport("김혜수");
    Support alice = new NoSupport("Alice");// 창구 역할, 아무것도 해결안 함
    Support bob = new LimitSupport("Bob", 100); // 100이하 일때만 해결
    Support charlie = new SpecialSupport("Charlie", 429); // 429만 해결
    Support diana = new LimitSupport("Diana", 200);
    Support elmo = new OddSupport("Elmo"); // 홀수일 때만
    Support fred = new LimitSupport("Fred", 300); 

    support.setNext(alice).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

    for (int i = 1; i < 101; i ++) {
      support.support(new Trouble(i)); //첫 Support
  }

  }
}
