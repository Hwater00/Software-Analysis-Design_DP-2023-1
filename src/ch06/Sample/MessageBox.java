package ch06.Sample;

import ch06.Sample.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) { //s는 둘러싸는 대상이 되는 문자열
        int decolen = 1 + s.length() + 1; 
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        
        System.out.println(decochar + s + decochar); 

        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() { //복제품을 실제로 만드는 역할
        Product p = null;
        try {
            p = (Product)clone(); //자기 복제가 일어남
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
