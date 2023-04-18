package hs.ch01.pratice;

import java.util.Iterator;

public class Attendance implements Iterable<Student> {
  private Student[] attendance;
  private int last;

  public Attendance(int maxsixe){
    this.attendance = new Student[maxsixe];
    last=0;
  }

  public void appendStudent(Student s){
    this.attendance[last]=s;
    last++;
  }
  public Student getFromStudent(int index){
    return attendance[index];
  }
  public int getLength(){
    return last;
  }
  public Iterator<Student> iterator(){
    return new AttendanceIterator(this);
  }
}
