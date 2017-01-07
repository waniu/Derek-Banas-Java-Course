//Scanner import
import java.util.Scanner;

public class Lesson02
{
	//Creating scanner object
	static Scanner userInput = new Scanner(System.in);
	
	//Main function
	public static void main(String[] args) 
	{
		System.out.print("Your favorite number: ");
		
		//Now is catching ints //Other: hasNextDouble; hasNextFloat; ...Line (Strings); ...Boolean; ...Byte; ...Long; ...Short;
		if(userInput.hasNextInt())
		{
			//nextDouble... like before
			int numberEntered = userInput.nextInt();
			int startNumberEntered = numberEntered;
			
			System.out.println("You entered: " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
			
			//Short ways to do stuff
			numberEntered += 5;	
			System.out.println("Plus 5: " + numberEntered);
			numberEntered -= 5;
			System.out.println("Minus 5: " + numberEntered);
			numberEntered *= 5;
			System.out.println("Multiplayed by 5: " + numberEntered);
			numberEntered /=5;
			System.out.println("Divided by 5: " + numberEntered);
			numberEntered %=5;
			System.out.println("That's all what have left: " + numberEntered);
			numberEntered++;
			System.out.println("Incremented: " + numberEntered);
			numberEntered--;
			System.out.println("Decremented: " + numberEntered);
			
			//Examples of Math library
			int numberABS = Math.abs(numberEntered);
			System.out.println(numberABS);
			
			int whichIsBigger = Math.max(startNumberEntered, numberEntered);
			System.out.println(whichIsBigger);
			
			double numSqrt = Math.sqrt(5.23);
			System.out.println("Square root of 5.23: " + numSqrt);
			
			int numRound = (int) Math.round(5.23);
			System.out.println("Standard rounding of 5.23: " + numRound);
			
			int numCeiling = (int) Math.ceil(5.23);
			System.out.println("Rounding 5.23 UP: " + numCeiling);
			
			int numFlooring = (int) Math.floor(5.23);
			System.out.println("Rounding 5.23 DOWN: " + numFlooring);
			
			//Return random number between 0-9
			int randomNumber = (int) (Math.random() * 10);
			System.out.println("Random number: " + randomNumber);
		
		}	
		
		
		
		else
		{
			System.out.println("Enter an integer next time!");
		}
	}
}