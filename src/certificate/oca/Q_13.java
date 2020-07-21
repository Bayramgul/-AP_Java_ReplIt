package certificate.oca;

public class Q_13 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		sb.append("ajsnfjfbnfvjenv");
		String s="hello";
//		String k=sb.toString();
//		System.out.println(k);      //bunlari bastirinca bos String cikiyor.
//		System.out.println("--");
//  	System.out.println(s);
//		System.out.println(sb);
		System.out.println(sb);
		if (sb.equals(s)) { // iki farkli object i gosteriyorlar ayrica degiskenlerin turlari de farkli
			System.out.println("March 1");
		}else if (sb.toString().equals(s.toString())) { // her ikisi de bos string  eger null olsalardi nullPointExeption verirdi
			System.out.println("March 2");
		}else {
			System.out.println("No Match");
		}
		
	}
	}


