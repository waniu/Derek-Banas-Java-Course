
public class Lesson16 
{
	public static void main(String[] args)
	{
		
		Object superCar = new Vehicle();
		
		System.out.println(((Vehicle)superCar).getSpeed());
		
		Vehicle superTruck = new Vehicle();
		
		System.out.println(superTruck.equals((Vehicle)superCar));
		
		System.out.println(superCar.hashCode());
		System.out.println(superTruck.hashCode());
	
		System.out.println(superCar.getClass());
		System.out.println(superCar.getClass().getName());
		
		if(superCar.getClass() == superTruck.getClass())
		{
			System.out.println("The same!");
		}
	
		System.out.println(superCar.getClass().getSuperclass());
	
		superTruck.steWheels(6);
		
		Vehicle superTruck2 = (Vehicle)superTruck.clone();
		
		System.out.println(superTruck.getWheel());
		System.out.println(superTruck2.getWheel());
	
		System.out.println(superTruck.hashCode());
		System.out.println(superTruck2.hashCode());
	
	
	
	
	
	
	}//END of main()
}
