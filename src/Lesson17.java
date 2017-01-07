public class Lesson17 
{
	public static void main(String[] args) 
	{
		Thread getTime = new GetTime20();
		
		Runnable getMail = new GetTheMail(5);
		Runnable getMailAgain = new GetTheMail(11);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
		
		
		
		
		
		
		
		
		
	}//End of main()
		
}
