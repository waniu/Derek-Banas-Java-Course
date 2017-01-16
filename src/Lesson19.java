import java.util.regex.*;

public class Lesson19 {

	public static void main(String[] args) {
		
		String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		/*
		[ ]  Insert characters that are valid
		[^ ]  Insert characters that are not valid
		\\s  Any white space
		\\S  Any non white space
		{n,m}  Whatever proceeds must occur between n and m times
		* Zero or more
		+ One or more
		*/
		
		// Word contains letters that are 2 to 20 characters in length
		// [A-Za-z]{2,20} 0r \w{2,20}
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//	To find digits - \\d; Not a digit - \\D
		//	Zip Code 5 digits long
		regexChecker("\\s\\d{5}", longString);
		
		//	2 characters that start with a C or A
		//	regex to find state matching to this
		regexChecker("A[KLRZ] | C[AOT]", longString);
		
		//	Minimum without maximum - {5,}
		//	I should backslash: . ^ * + ? {} [] \ | () 
		regexChecker("\\{{1,}", strangeString);
		//	OR
		regexChecker("\\{+", strangeString);
		
		//	Find anything but 5 of them
		regexChecker(".{5}", strangeString);
		
		//	\\w is equal to [A-Za-z0-9_] -----> \\W is opposite
		//	Looking for E-mail: johnsmith@hotmail.com 
		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
		
		//	Looking for phone numbers: 1-(412)555-1212 | 412-555-1234 | 412 555-1234
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
		regexReplace(longString);
		
		
		
	}//End of main()
	
	
	public static void regexChecker(String theRegex, String strToCheck){
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(strToCheck);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
		
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
			System.out.println();
		}
	}//End of regexChecker()
	
	public static void regexReplace(String strToReplace){
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(strToReplace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
		
	}//End of regexReplace
	
	
	
	
	
	
	
	
	
	
	
}
