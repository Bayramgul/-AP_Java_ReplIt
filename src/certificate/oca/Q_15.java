package certificate.oca;

public class Q_15 {

	public static void main(String[] args) {

int[] intArr= {8,16,32,64,128};
		
		// Which two code fragments, independently, print each element in this array?
		
		for (int i:intArr) {//for each loop
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i=0; i<intArr.length; i++) {//regular for loop
			System.out.print(intArr[i]+" ");
		}
	}

}
