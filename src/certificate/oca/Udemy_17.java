package certificate.oca;

import java.util.ArrayList;
import java.util.List;

//import certificate.oca.Udemy_17.Student;


public class Udemy_17 {

	
	     private String name;
	     private int age;
	 
	     Udemy_17(String name, int age) {
	         this.name = name;
	         this.age = age;
	     }
	 
	     public String toString() {
	         return "Student[" + name + ", " + age + "]";
	     }
	}
 class Test{	 
public static void main(String[] args) {
    List<Udemy_17> students = new ArrayList<>();
    students.add(new Udemy_17("James", 25));
    students.add(new Udemy_17("James", 27));
    students.add(new Udemy_17("James", 25));
    students.add(new Udemy_17("James", 25));

    students.remove(new Udemy_17("James", 25));

    for(Udemy_17 stud : students) {
        System.out.println(stud);
    }
}}

