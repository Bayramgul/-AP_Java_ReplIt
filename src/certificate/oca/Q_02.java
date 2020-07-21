package certificate.oca;

public class Q_02 {

	public static void main(String[] args) {
		int iVar=100;
		float fVar=100.100f;
		double dVar=123;
		
		//iVar=fVar;
		fVar=iVar;
		dVar=fVar;
		//fVar=dVar;
		dVar=iVar;
		//iVar=dVar;
	}


//			xxx ==> xxx  kendiliginden olmaz type casting gerekli

//boolean==>byte ==> char==> short ==> int ==> long ==> float ==> double ==> Integer ==> Double ==> Object

//					<== kendiliginden donusturulebilir sorun olmaz

}
