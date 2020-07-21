import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		System.out.println(returnDup());
		
		   } 
	static String returnDup(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter text : ");
		String text=scan.nextLine();
		int i;
		int j;
		   String t = "";//text without duplicated character

		   for (i = 0; i< text.length(); i++) {
		       int count = 1;

		       for (j =i+1; j < text.length(); j++) {
		           if (text.charAt(i) == text.charAt(j)) {
		                count++;//this will be duplicated character 
		                
		 		       }
		           }if (count ==1){//just take one time character
	 		           t += text.charAt(i);
	 		           
		       }
	}
		   return t;
}}
