import java.util.Scanner;

public class OneChar {

	public static void main(String[] args) {
		OneChar obj = new OneChar();
		System.out.println(noRepeat());
	}
	static String noRepeat() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter text");
		String texts = scan.next();
		char[] text = texts.toCharArray();
		
		char c = 0;
		String t = "";
		int count=0;
		for (int i = 0; i < text.length; i++) {
			c = text[i]; 
			count++;
			System.out.println("char is "+c);
			System.out.println("count is "+count);
			if (count > 1) {
				t = texts.replace(c, '\0');// in char '\0\ means empty char
			}
		}
		return t;
	}

	

}
