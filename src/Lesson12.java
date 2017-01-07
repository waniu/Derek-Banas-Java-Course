import java.util.Arrays;
import java.util.LinkedList;

public class Lesson12 
{
	public static void main(String[] args) 
	{
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Jakub Wanowski");
		names.add("Daria £awniczak");
		
		names.addFirst("Pierwszy wpis na liœcie");
		names.addLast("Ostatni wpis na liœcie");
		
		names.add(1, "Tekst na drugiej pozycji");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println();
		
		names.remove(0);
		names.remove(0);
		names.remove("Ostatni wpis na liœcie");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("First index: " + names.get(0) + "\n");
		System.out.println("Last index: " + names.getLast() + "\n");
		
		LinkedList<String> namesCopy = new LinkedList<String>(names);
		 
		System.out.println("namesCopy: " + namesCopy + "\n");
		System.out.println("Daria index at: " + names.indexOf("Daria £awniczak") + "\n");
		System.out.println("List Empty: " + names.isEmpty() + "\n");
		System.out.println("How many: " + names.size() + "\n");
		
		namesCopy.push("Pawe³ Koper");
		namesCopy.pop();
		namesCopy.push("Pawe³ Koper");
		namesCopy.push("Pawe³ Koper");
		
		for(String name : namesCopy)
		{
			System.out.println(name);
		}
		System.out.println();
		
		Object[] nameArray = new Object[4];
		
		nameArray = namesCopy.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
		System.out.println(namesCopy.indexOf("Pawe³ Koper"));
		
		namesCopy.clear();
		
		System.out.println("List Empty: " + namesCopy.isEmpty() + "\n");
		
		
		
	}//END of main()
}


















