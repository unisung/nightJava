package ch01;

import java.io.Serializable;

public class Student implements Serializable{
 //필드
  String name;
  String no;
  //생성자
public Student(String name, String no) {
	this.name = name;
	this.no = no;
}
  
}
