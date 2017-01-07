//My class
public class HelloWorld 
{
	//Main function
	public static void main(String[] args) 
	{
		//Basic variables
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		
		float bigFloat = Float.MAX_VALUE;
		//How to print sth on the screen
		System.out.println(bigFloat);
		
		double bigDouble = Double.MAX_VALUE;
		System.out.println(bigDouble);
		
		boolean trueOrFalse = true;
	
		char randomCharacter = 65;
		char anotherCharacter = 'A';
		System.out.println(randomCharacter);
		
		String randomString = "I'm a random";
		String anotherString = "string!";
		//Combining strings
		String combinedString = randomString + " " + anotherString;
		System.out.println(combinedString);
		
		//Variables as string
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOrFalse);
		
		System.out.println(byteString+' '+shortString);
		
		//Casting works for: (byte), (short), (int), (long), (double)
		double aDoubleValue = 3.1454;
		int doubleToInt = (int) aDoubleValue; 
		System.out.println(doubleToInt);
		
		//String to other data type // parseByte; parseShort; parseLong; parseFloat; parseDouble; parseBoolean
		int stringToInt = Integer.parseInt(intString);
		System.out.println(stringToInt);
		boolean stringToBoolean = Boolean.parseBoolean(booleanString);
		
		if(stringToBoolean)
		{
			System.out.println("dzia³a");
		}
		
	}
}
