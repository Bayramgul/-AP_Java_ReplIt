
public class Practice42 {
	//Then, starting on line 4, write code that will return the character in "word" at the index "index"

	static char getChar(String word, int index)
	{
		char c = 0;
		c= word.charAt(index);
	 return c;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(getChar("hello",1)); //should be 'e'
	}

}
