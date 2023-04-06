package hw.ch05.idcard;

import hw.ch05.framework.Product;

public class IDCard extends Product {
  private String owner;

  public IDCard(String onwer){
    System.out.println(owner + "의 카드를 만듭니다.");
    this.owner = onwer;
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
