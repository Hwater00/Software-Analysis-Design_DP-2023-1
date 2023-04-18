package hw.ch03;

public class Main {
    public static void main(String[] args) {

        AbstractDisplay ch03 = new KimHysSooDisplay("김혜수", "20200733", 4);

        System.out.println("20200733 김혜수 \n");

        // ch03.display(10); 
        ch03.display(5); // 5를 실행!
        
    }
}
