import java.io.*;

public class Lesson32 {
	
	static File customerDir;

	public static void main(String[] args) {
	
		//Create array of type Customer
		Customer[] customers = getCustomers();
		
		//Define new directory
		customerDir = new File("E:/IT/Java/Projekty/Derek Banas/files32");
				
		//Create directory
		customerDir.mkdir();
		
		//It's used to write characters to a file
		PrintWriter custOutput = createFile("E:/IT/Java/Projekty/Derek Banas/files32/customers.txt"); 
		
		//One cycle write one customer to file
		for(Customer person : customers){
			
			createCustomers(person, custOutput);
		}
		
		//Close connection to the PrintWriter
		custOutput.close();
		
		//This method print data from file to console
		getFileInfo();
		
	}//End of main()
	
	//------------------------------------------------------------------
	
	//Class which define all files of customers
	private static class Customer{
		
		public String firstName, lastName;
		public int custAge;
		
		public Customer(String firstName, String lastName, int custAge){
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.custAge = custAge;
		}	
	}//End of Customer class
	
	//------------------------------------------------------------------
	
	//Create of array of Customer Objects
	private static Customer[] getCustomers(){
		
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John", "Smith", 21);
		customers[1] = new Customer("Sally", "Smith", 21);
		customers[2] = new Customer("Paul", "Smith", 21);
		customers[3] = new Customer("Tom", "Smith", 23);
		customers[4] = new Customer("Mark", "Smith", 21);
		
		return customers;
	}//End of getCustomers()
	
	//-------------------------------------------------------------------
	
	private static void createCustomers(Customer customer, PrintWriter custOutput){
		
		String custInfo = customer.firstName + " " + customer.lastName + " ";
		
		custInfo += Integer.toString(customer.custAge);
		
		custOutput.println(custInfo);
	}//End of createCustomer()

	//------------------------------------------------------------------
	
	//Create a file and the PrintWriter that will write to the file
	private static PrintWriter createFile(String fileName){
		
		try{
			File listOfNames = new File(fileName);
			
			//FileWriter is used to write streams of characters to a file
			//BufferedWriter gathers a bunch of characters and writes them at one time(Speeds up program)
			//PrintWriter is used to write characters to the console, file
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
			
			return infoToWrite;
		}
		
		catch(IOException e){
			
			System.out.println("An I/O Error Occured");
			System.exit(0);
		}
		
		return null;
	}//End of createFile()
	
	//------------------------------------------------------------------
	
	private static void getFileInfo(){
		
		System.out.println("Info Written to File\n");
		
		File listOfNames = new File("E:/IT/Java/Projekty/Derek Banas/files32/customers.txt");
		
		try{
			
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfNames));
			
			String custInfo = getInfo.readLine();
			
			while(custInfo != null){
				
				//System.out.println(custInfo);
				
				String[] indivCustData = custInfo.split(" ");
				
				int custAge = Integer.parseInt(indivCustData[2]);
				
				System.out.println("Customer " + indivCustData[0] + " is " + indivCustData[2]);
				
				custInfo = getInfo.readLine();
			}
		}
		
		catch(FileNotFoundException e){
			
			System.out.println("Couldn't Find File");
			System.exit(0);
		}
		
		catch(IOException e){
			
			System.out.println("An I/O Error Occured");
			System.exit(0);
		}
	}
	
}//End of Lesson32 class
















