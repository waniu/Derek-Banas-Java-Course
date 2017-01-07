public class Monster 
{
	public final String TOMBSTONE = "Here Lies a Dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	//Getters 
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovment()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	
	//Setters
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		
		if(health < 0)
		{
			alive = false;
		}
	}
	
	//Method overload
	public void setHealth(double decreseHealth)
	{
		int intDecreseHealth = (int) decreseHealth;
		
		health -= intDecreseHealth;
		
		if(health < 0)
		{
			alive = false;
		}
	}
	
	//Constructor
	
	public Monster(int newHealth, int newAttack, int newMovement)
	{
		health = newHealth;
		attack = newAttack;
		movement = newMovement;
	}
	
	//Default Constructor
	public Monster()
	{
		
	}
	
	public Monster(int newHealth)
	{
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack)
	{
		this(newHealth);
		attack = newAttack;
	}
	
	///////////////////////////////////////////////
	
	public static void main(String[] args) 
	{
		Monster Frank = new Monster();
		
		System.out.println(Frank.attack);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
