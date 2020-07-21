import java.util.Scanner;

public class SumOddRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    int num=0;
	    int sum=0;
	    if(num>=num1 && num<=num2){
	      if(num%2!=0){
	        sum+=num;
	        
	      }
	    }
	    System.out.print(sum);
	    
	}

}
