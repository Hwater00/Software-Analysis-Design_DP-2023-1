package ch06.Sample;

import ch06.Sample.framework.Manager;
import ch06.Sample.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비 
        Manager manager = new Manager(); //1.Manager 인스턴스를 생성한다.
        UnderlinePen upen = new UnderlinePen('-'); //UnderlinePen 인스턴스
        MessageBox mbox = new MessageBox('*'); //MessaheBox 인스턴스
        MessageBox sbox = new MessageBox('/');
    
        //
        MessageBox box1 = new MessageBox('$');
        box1.use("Kim Hye Soo");

        //2. (인스턴스를 이름을 붙여서) 등록
        manager.register("strong message", upen); 
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        manager.register("khs box", box1);

        // 생성과 사용 
        //클래스 이름 대신 문자열로 객체를 얻음
        Product p1 = manager.create("strong message"); //3. Manger에서 create() 호출해 원하는 이름의 제품을 얻어서
        p1.use("Hello, world.");  //그것을 use() 실행한다.

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

        
        Product p4 = manager.create("khs box");
        p4.use("Diksung University");

    }
}
