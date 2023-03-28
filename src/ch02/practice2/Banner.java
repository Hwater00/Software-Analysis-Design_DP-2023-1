package ch02.practice2;

// 220볼트 이미 제공되는 것 (Adaptee)
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

//public void showWithParen() => 메서드 프로토타입 예시