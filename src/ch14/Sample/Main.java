package ch14.Sample;

public class Main {
    public static void main(String[] args) {
        //해결자 생성
        Support alice = new NoSupport("Alice");// 창구 역할, 아무것도 해결안 함
        Support bob = new LimitSupport("Bob", 100); // 100이하 일때만 해결
        Support charlie = new SpecialSupport("Charlie", 429); // 429만 해결
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo"); // 홀수일 때만
        Support fred = new LimitSupport("Fred", 300);

        // 사슬 형성  bob타입 리턴 -> charlie 타입 리턴
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        //사슬은 언제든지 순서를 바꿀 수 있음 : alice.setNext(fred).setNext(bob).setNext(charlie)

        // 다양한 트러블 발생
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i)); //첫 Support
        }
    }
}
