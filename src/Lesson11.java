import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Lesson11 
{
	public static void main(String[] args) 
	{
		//First way of declaration
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		
		//Second way of declaration
		ArrayList arrayListTwo = new ArrayList();
		
		//Array list only for strings
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jakub Wanowski");
		names.add("Pawe³ Koper");
		names.add("Pawe³ Leœniak");
		
		//Add with index
		names.add(1, "Daria £awniczak");
		
		//Set index
		names.set(0, "in¿ Jakub Wanowski");
		
		//Remove index
		names.remove(2);
		//Remove range - names.removeRange(0, 1);
		
		//Easy way to print all arrayList
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println();
		
		//The same but Array way
		for(String i : names)
		{
			System.out.println(i);
		}
		System.out.println();
		//System.out.println(names);
		
		//--------------------------------------------
		
		//ITERATORS
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext())
		{
			System.out.println(indivItems.next());
		}
		System.out.println();
		
		//COPYS
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		System.out.println(nameCopy + "\n");
		
		//Adding strings
		
		String anrdzejFidur = "Andrzej Fidur";
		
		names.add(anrdzejFidur);
		
		
		for(String i : names)
		{
			System.out.println(i);
		}
		System.out.println();
		
		if(names.contains(anrdzejFidur))
		{
			System.out.println("Andrzej jest z nami!! \n");
		}
		
		//Compare
		
		if(names.containsAll(nameCopy))
		{
			System.out.println("Everythig of nameCopy is in the names");
		}
		System.out.println();
		
		//Deleting list
		
		names.clear();
		System.out.println(names);
		
		if(names.isEmpty())
		{
			System.out.println("names list is empty");
		}
		System.out.println();
		
		//ArrayList -> Array
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
		
		
		
		
		
	
		
		
	}//End of main()
		
}
