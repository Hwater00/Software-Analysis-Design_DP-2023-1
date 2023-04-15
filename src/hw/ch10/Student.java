package hw.ch10;


public class Student implements Comparable<Student>  {
  String name="";
  int height;
  String id;

  public Student(String name, String id, int height){
    this.name = name;
    this.id = id;
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public String toString(){
    return "이름:"+ name+", 학번:"+id +", 키:"+height ;
  }

  @Override
  public int compareTo(Student s) {
    //height 크기를 비교함
    if (this.height != s.height){
      if(this.height < s.height){
        return -1;
      }
    }return 0;
  }

}




// for(int i=0; i<sbook.size();i++){
    //   System.out.println(sbook.get(i).toString());
    // }
    /*link : https://www.youtube.com/watch?v=zCpInXvVol0 */

