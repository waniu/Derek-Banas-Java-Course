
public abstract class Crashable 
{
	boolean carDrivable = true;
	
	public void youCrash()
	{
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
	
	
}
