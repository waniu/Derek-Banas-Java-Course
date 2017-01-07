
public class Vehicle extends Crashable implements Drivable, Cloneable
{
	int numOfWheels = 4;
	double theSpeed = 0;
	
	int carStrenght = 0;
	
	public int getWheel()
	{
		return this.numOfWheels;
	}
	
	public void steWheels(int numWheels)
	{
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed()
	{
		return this.theSpeed;
	}
	
	public void setSpeed(double speed)
	{
		this.theSpeed = speed;
	}
	
	public void setCarStrength(int carStrenght)
	{
		this.carStrenght = carStrenght;
	}
	
	public int getCarStrength()
	{
		return this.carStrenght;
	}
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(int wheels, double speed)
	{
		numOfWheels = wheels;
		theSpeed = speed;
	}
	
	public Object clone()
	{
		Vehicle car;
		
		try
		{
			car = (Vehicle) super.clone();
		}
		
		catch(CloneNotSupportedException e)
		{
			return null;
		}
		return car;
	}
	
	
	
}
