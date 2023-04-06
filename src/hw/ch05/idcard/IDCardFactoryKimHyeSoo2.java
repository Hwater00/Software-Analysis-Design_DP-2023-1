package hw.ch05.idcard;

public class IDCardFactoryKimHyeSoo2 {
  
  //3.객체 미리 생성
  private static IDCardFactoryKimHyeSoo2 idcardFactoryKimHyeSoo= null;

  //1.private 생성자
  private IDCardFactoryKimHyeSoo2(){
    slowdown();

  }

  //2.객체를 얻어가는 메소드
  public static synchronized IDCardFactoryKimHyeSoo2 getInstance(){
    if(idcardFactoryKimHyeSoo == null ){
      idcardFactoryKimHyeSoo= new IDCardFactoryKimHyeSoo2();
    }

    return idcardFactoryKimHyeSoo;
  }


  private void slowdown() {
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
    }
}

}
