import java.util.*;
import java.text.DateFormat;

public class CheckSystemTime implements Runnable
{
	public void run()
	{
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		String timeOutput;
		
		rightNow = new Date();
		currentLocale = new Locale("pl");
		
		//Style format
		timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
		timeOutput = timeFormatter.format(rightNow);
		
		//Print on screen
		System.out.println("Time: " + timeOutput);
	}
	
}
