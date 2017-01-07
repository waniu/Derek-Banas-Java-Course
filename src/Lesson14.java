
public class Lesson14 
{
	public static void main(String[] args) 
	{
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		System.out.println();
		
		Cats morris = new Cats("Morris", "Tuna", "Robber Mouse");
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		morris.playWith();
		morris.walkAround();
		
		//Every Method & Field in Animals is in the Class Cats
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		
		acceptAnimal(tabby);
		
	}//END of main()

	
	public static void acceptAnimal(Animals animal)
	{
		System.out.println(((Cats)animal).favToy);
		System.out.println();
		System.out.println(animal.getName());
		System.out.println(animal.favFood);
		System.out.println();
		
		animal.walkAround();
		
		Cats tempCat = (Cats) animal;
		
		System.out.println(tempCat.favToy);
		
		if(animal instanceof Cats)
		{
			System.out.println(animal.getName() + " is a Cat");
		}
	}
	
	
	
	
	
	
}
