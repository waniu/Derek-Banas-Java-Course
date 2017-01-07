
public class GetTheMail implements Runnable
{
	private int startTime;

	public GetTheMail(int startTime)
	{
		this.startTime = startTime;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(startTime * 1000);
		}
		catch(InterruptedException e) {}
		
		System.out.println("Checkin Mail");
		
		
		
	}
	
}
