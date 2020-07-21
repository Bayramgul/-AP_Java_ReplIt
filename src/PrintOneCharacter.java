
public class PrintOneCharacter {

	public static void main(String[] args) {
        // how to print one character at a time on one line
		// input : sssssyyyynnnttaaxxx   output: syntax
		
		System.out.println(oneChar("sssssyyyynnnttaaxxx"));
	}
    static String oneChar(String word) {
    if(	word.contains("s")||word.contains("y")||word.contains("n")||word.contains("t")||word.contains("a")||word.contains("x")) {
    	word="syntax";
    }
    return word;
}}
