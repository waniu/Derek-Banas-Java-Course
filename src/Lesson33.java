import java.io.*;

public class Lesson33 {

	public static void main(String[] args) {
		
		Customer[] customers = getCustomers();
		
		//HERE I HAVE TO FINISH FOR NOW!!!!!!!
		
	}//End of main()
	
	private static class Customer{
		
		public String custName;
		public int custAge;
		public double custDebt;
		public boolean oweMoney;
		public char custSex;
		
		public Customer(String custName, int custAge, double custDebt, boolean oweMoney, char custSex){
			
			this.custName = custName;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
			
		}//End of Customer()
		
	}//End of Customer class
	
	private static Customer[] getCustomers(){
		
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
		customers[1] = new Customer("Adam Smith", 22, 122.25, true, 'M');
		customers[2] = new Customer("Jim Smith", 41, 1200.25, true, 'M');
		customers[3] = new Customer("Bob Smith", 28, 12344.25, true, 'M');
		customers[4] = new Customer("Abraham Smith", 76, 0, false, 'M');
		
		return customers;
		
	}
	
}//End of Lesson33 class
