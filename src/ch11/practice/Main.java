package ch11.practice;

public class Main {
  public static void main(String[] args){

/*     Entry f1 = new File("vi",100);
    System.out.println(f1.getName());
    System.out.println(f1.getSize());
    System.out.println(f1); //toString()출력  */
    
    Directory root= new Directory("root"); //타입은 Entry인데 실제 들어가는 것은 디렉터리 객체
    Directory bin=  new Directory("bin");
    Directory tmp=  new Directory("tmp");
    Directory usr=  new Directory("usr");

    root.add(bin); //디렉토리에는 add가 있지만 부모인 Entry에는 add가 없어, root는 엔트리 타입으로 add를 할 수 없다 
    //1. root를 디렉토리로 선언 2. 타입 캐스트((Directory).root).add(bin);
    root.add(tmp);
    root.add(usr);

    bin.add(new File("vi",100));
    bin.add(new File("latex",200));

    System.out.println(root.getSize());

    root.printList("/");
    root.printList("");

  }
}
