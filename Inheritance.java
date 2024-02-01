package javapractice;
class Player
{
	String name;
	int age;
	public Player(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void displaydetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
class Batter extends Player
{
	int runsscored;
	public Batter(String name, int age, int runsscored)
	{
		super(name, age);
		this.runsscored = runsscored;
	}
	void displayrunsscored()
	{
		System.out.println("Runs Scored : " + runsscored);
	}
}
class Bowler extends Player
{
	int wickets;
	public Bowler(String name, int age, int wickets)
	{
		super(name, age);
		this.wickets = wickets;
	}
	void displaywickets()
	{
		System.out.println("Wickets Taken : " + wickets);
	}
}
class Allrounder extends Batter
{
	int runsscored;
	String role;
	public Allrounder(String name, int age, int runsscored)
	{
		super(name, age, runsscored);
		this.runsscored = runsscored;
	}
	void displayrunsscored()
	{
		System.out.println("Runs Scored : " + runsscored);
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
		Batter batter = new Batter("Rohit Sharma", 37, 19000);
		batter.displaydetails();
		batter.displayrunsscored();
		System.out.println();
		Bowler bowler = new Bowler("Jasprit Bumrah", 29, 300);
		bowler.displaydetails();
		bowler.displaywickets();
		System.out.println();
		Allrounder allrounder = new Allrounder("Ben Stokes", 34, 12000);
		allrounder.displaydetails();
		allrounder.displayrunsscored();
		System.out.println();
	}
}