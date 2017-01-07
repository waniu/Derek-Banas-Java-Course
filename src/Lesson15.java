
public class Lesson15 
{
	public static void main(String[] args) 
	{
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Car max speed: " + car.getSpeed());
		System.out.println("Num of wheels: " + car.getWheel());
		
		car.setCarStrength(10);
		System.out.println("Strenth: " + car.getCarStrength());
		
		
		
	}//END of main()
	
	
}
