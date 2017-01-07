import java.util.Scanner;

public class Lesson04 
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int i = 1;
		
		while(i <= 20)
		{
			//Continue the loop without rest of the code in this iteration
			if(i == 3)
			{
				i+=2;
				continue;
			}
			
			System.out.println(i);
			i++;
			
			//Odd numbers trick
			if ((i%2) == 0)
			{
				i++;
			}
			
			//Breaking the loop
			if(i > 10)
			{
				break;
			}
		}
		
		//////////////////////////////////////////////////////////////////////
		/*
		double myPI = 4.0;
		double j = 3.0;
		
		while(j < 1000000)
		{
			myPI = myPI - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPI);
		}
		
		System.out.println(Math.PI);
		*/
		//////////////////////////////////////////////////////////////////////
		
		String contYorN = "Y";
		
		int h = 1;
		
		//It works for Y or y
		while(contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.println("Continue y or n? ");
			contYorN = userInput.nextLine();
			h++;	
		}
		
		///////////////////////////////////////////////////////////////////////
		
		int k = 10;
		//DO-WHILE loop always execute all code minimum once
		do
		{
			System.out.println(k);
			k++;
		} while(k < 10);
		
		//////////////////////////////////////////////////////////////////////
		
		for (int l = 10; l >= 1; l--)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
