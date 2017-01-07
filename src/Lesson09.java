import java.util.Arrays;
import java.util.Scanner;

public class Lesson09 
{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Declaration of an Array
		int[] randomArray;
		//Setting how big is this Array
		randomArray = new int[20];
		//Putting value to the box number 0 in the Array 
		randomArray[0] = 2;
		
		//Another type of Array[3] declaration
		int[] numberArray = new int[3];
		
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = userInput.nextInt();
		}
		
		for(int i = 0; i < numberArray.length; i++)
		{
			System.out.println("In box number " + i + " you saved: " + numberArray[i]);
		}
		
		//Another type of Array[3] declaration
		String[] stringArray = {"just", "random", "words"};
		System.out.println(stringArray[1]);
		
		///////////////////////////////////////
		//How Array looks like
		
		int k = 1;
		while (k <= 13){System.out.print('-'); k++;}
		System.out.println();
		
		for(int j = 0; j < numberArray.length; j++)
		{
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		k = 1;
		while (k <= 61){System.out.print('-'); k++;}
		System.out.println();
		
		///////////////////////////////////////////////
		//MultiDemention Arrays
		
		String [][] multiArray = new String [10][10];
		
		for(int i = 0; i < multiArray.length; i++)
		{
			for(int j = 0; j < multiArray[i].length; j++)
			{
				multiArray[i][j] = i + " " + j;
			}
		}
		
		for(int i = 0; i < multiArray.length; i++)
		{
			for(int j = 0; j < multiArray[i].length; j++)
			{
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println("|");
		}
		
		k = 1;
		while (k <= 61){System.out.print('-'); k++;}
		System.out.println();

		///////////////////////////////////////////////
		
		for(int row : numberArray)
		{
			System.out.print(row);
		}
		System.out.println();
		
		for(String[] rows : multiArray)
		{
			for(String column : rows)
			{
				System.out.print("| " + column + " ");
			}
			System.out.println("|");
		}
		
		////////////////////////////////////////////////
		
		int[] numberCopy = Arrays.copyOf(numberArray, 1);
		for(int row : numberCopy)
		{
			System.out.print(row);
		}
		
		System.out.println("\n");
		
		int[] numberCopy23 = Arrays.copyOfRange(numberArray, 1, 2);
		for(int row : numberCopy23)
		{
			System.out.print(row);
		}
		System.out.println("\n");
		
		
		System.out.println(Arrays.toString(numberArray));
		System.out.println("\n");
		
		/////////////////////////////////////////////////////////
		//Filling Arrays with values
		
		int[] moreNumbers = new int[20];
		Arrays.fill(moreNumbers, 2);
		System.out.println(Arrays.toString(moreNumbers));
		
		////////////////////////////////////////////////////////
		//Sorting Arrays
		
		int[] numToSort = new int[10];
		
		for(int i = 0; i < numToSort.length; i++)
		{
			numToSort[i] = (int) (Math.random() * 101);
		}
		System.out.println(Arrays.toString(numToSort));
		Arrays.sort(numToSort);
		System.out.println(Arrays.toString(numToSort));
		
		//Searching of value
		
		int whereIs50 = Arrays.binarySearch(numToSort, 50);
		System.out.println(whereIs50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
