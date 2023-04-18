package hs.ch01.pratice;

import java.util.Iterator;

public class AttendanceIterator implements Iterator<Student> {
  Attendance attendanceStudent;
  int index;

  public AttendanceIterator(Attendance attendanceStudent){
    this.attendanceStudent= attendanceStudent;
    index=0;
  }
  public boolean hasNext(){
  if(index < attendanceStudent.getLength()){
    return true;
  }
    else return false;
  }

  public Student next(){
    Student s = this.attendanceStudent.getFromStudent(index);
    index++;
    return s;
  }
}
