package ch04.practice.idcard;

import ch04.practice.framework.Product;

//뼈대에 살을 붙여 구체적인 내용을 구현하는 역할
//Product에 인자 없는 생성자가 먼저 호출되고 IDCard 실행됨
public class IDCard extends Product { //Product를 상속
    private String owner;

    //패키지 visibility로 앞에 아무것도 없으면 같은 패키지내에서만 부를 수 있다.
    // public IDCard(String owner) {
    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() { //this는 현재 jdcard 객체를 나타낸다, idcard 타입의 this
        System.out.println(this + "을 사용합니다."); // +: 문자열 연결 , this,toString()이 자동으로  호출됨

    }

    @Override
    public String toString() {//Object라는 모든 클래스의 부모 클래스로부터 상속
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
