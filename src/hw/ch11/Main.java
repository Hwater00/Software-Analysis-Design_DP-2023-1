package hw.ch11;


public class Main {
  public static void main(String[] args){


    Directory MyDocuments= new Directory("MyDocuments", "20230401", "KimHyesoo");
    Directory MyData=  new Directory("MyData", "20230401", "KimHyesoo");
    Directory MyPictures=  new Directory("MyPictures", "20230401", "KimHyesoo");

    MyDocuments.add(new File("김혜수0.doc", "20230501", 1000, "KimHyesoo"));
  
    MyDocuments.add(MyData);
    MyData.add(new File("김혜수1.doc", "20230501", 2000, "KimHyesoo"));
    MyData.add(new File("김혜수2.java", "20230501", 3000, "KimHyesoo"));
  
    MyData.add(MyPictures);
    MyPictures.add(new File("김혜수3.gif", "20230601", 4000, "KimHyesoo"));
    MyPictures.add(new File("김혜수4.jpg", "20230601", 5000, "KimHyesoo"));
    MyPictures.add(new File("김혜수5.png", "20230601", 6000, "KimHyesoo"));

    System.out.println("학번, 이름 : 20200733, 김혜수");
    MyDocuments.printList("");

  }
}
