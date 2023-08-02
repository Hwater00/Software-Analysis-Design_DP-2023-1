package ch20.Sample;

public class Main {
    public static void main(String[] args) { //명령행 인자 agrs
        
        BigChar bc = new BigChar('1');
        bc.print();

        if (args.length == 0) { // 인자가 전달되지 않은 경우..
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        
        //인자를 받은 경우 실행..
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
