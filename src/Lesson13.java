import java.util.Arrays;

public class Lesson13 
{
	public static void main(String[] args) 
	{
		
		String randomString = "I'm just a randomString";
		System.out.println(randomString);
		
		String gotToQuote = "He said: \"U can do this!\"";
		System.out.println(gotToQuote);
		
		String directory = "C:\\ap.exe";
		System.out.println(directory);
		
		String letters = "abcde";
		
		System.out.println(letters.length());
		System.out.println(letters.equalsIgnoreCase(letters.toUpperCase()));
		
		String waniu = "WANIU";
		
		String[] lettersArray = waniu.split("");
		System.out.println(Arrays.toString(lettersArray));
		
	}//END of main()
	
}
