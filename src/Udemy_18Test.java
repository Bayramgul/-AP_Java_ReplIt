import certificate.oca.Udemy_18A;
import certificate.oca.Udemy_18B;

public class Udemy_18Test {
		   public static void main(String[] args) {
			   Udemy_18A obj1 = new Udemy_18A();
			   Udemy_18B obj2 = (Udemy_18B)obj1;
			   
		       obj2.print();
		   }
//		   java.lang.ClassCastException is thrown at RunTime
}
