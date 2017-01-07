public class Lesson03 
{
	public static void main(String[] args) 
	{
		int randomNumber = (int) (Math.random() * 50);
		
		/* Relation Operators:
		 * Java has 6 relation operators
		 * > : Greater Than
		 * < : Less Than
		 * == : Equal to
		 * != : Not Equal To
		 * >= : Grater Than Or Equal To
		 * <= : Less Than Or Equal To
		 */
		
		if(randomNumber < 25)
		{
			System.out.println(randomNumber + " is less than 25");
		}
		
		else if(randomNumber > 25)
		{
			System.out.println(randomNumber + " is more than 25");
		}
		
		else
		{
			System.out.println(randomNumber + " is equal to 25");
		}
		
		/////////////////////////////////////////////////////////////
		
		/* Logical Operators:
		 * Java has 6 logical operators
		 * ! : Converts the boolean value to the opposite form
		 * & : Return true if boolean value on the right and left are
		 * && : Return true if boolean value on the right and left are
		 * | : Return true if either boolean value on the right and left are
		 * || : Return true if either boolean value on the right and left are
		 * ^ : Return true if there is 1 true and 1 false boolean value
		 */
		
		if (!(false))
		{
			System.out.println("\nI turned false into a true"); // \n - new line
		}
		
		if (!(false) & (true))
		{
			System.out.println("true & true is true");
		}
		
		if (!(false) && (true))
		{
			System.out.println("true && true is true");
		}
		
		if ((false) | (true))
		{
			System.out.println("false | true is true");
		}
		
		if ((false) || (true))
		{
			System.out.println("false || true is true");
		}
		
		if ((false) ^ (true))
		{
			System.out.println("false ^ true is true");
		}
		
		////////////////////////////////////////////////////////////
		
		int valueOne = 1;
		int valueTwo = 2;
		
		//If valueOne is grater than valueTwo assign valueOne; If it's not assign valueTwo  
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		System.out.println(biggestValue);
		
		////////////////////////////////////////////////////////////
		
		char theGrade = 'b';
		
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great job");
			break;
		case 'b':
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("OK");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You Failed");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
