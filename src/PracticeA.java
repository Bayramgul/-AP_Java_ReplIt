import java.util.Scanner;

public class PracticeA {

	public static void main(String[] args) {
		/*
		 * Method name Initial (); 1- Initial adinda bir method create et 1 -Scannerdan
		 * kullanicinin adini ve soyadini al 2- Adinin ve saoyadinin ilk harflerini al
		 * 3-Onlari main method altinda method icerisinde print et.
		 */
		PracticeA obj=new PracticeA();
		System.out.println(obj.initial());
	}
 String initial() {
	 Scanner scan =new Scanner(System.in);
	 System.out.println("What is your first name?");
	  String name=scan.nextLine();
	  System.out.println("What is yoyr lastname?");
	  String last=scan.nextLine();
	  name.charAt(0);last.charAt(0);
	 String initials=name.charAt(0)+ " "+last.charAt(0);
	 return initials;
 }
}
