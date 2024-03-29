package javapractice;
class Player11
{
	String name;
	int age;
	public Player11(String name, int age)
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
class Batter11 extends Player11
{
	int runsscored;
	public Batter11(String name, int age, int runsscored)
	{
		super(name, age);
		this.runsscored = runsscored;
	}
	void displayrunsscored()
	{
		System.out.println("Runs scored : " + runsscored);
	}
}
class Bowler11 extends Player11
{
	int wicketstaken;
	public Bowler11(String name, int age, int wicketstaken)
	{
		super(name , age);
		this.wicketstaken = wicketstaken;
	}
	void displaywicketstaken()
	{
		System.out.println("Wickets taken : " + wicketstaken);
	}
}
class Allrounder11 extends Batter11
{
	int runsscored;
	public Allrounder11(String name, int age, int runsscored)
	{
		super(name, age, runsscored);
		this.runsscored = runsscored;
	}
	void displayrunsscored()
	{
		System.out.println("Runs scored : " + runsscored);
	}
}
public class Prac07 {
	public static void main(String[] args)
	{
		Batter11 batter = new Batter11("Rohit Sharma", 37, 19000);
		batter.displaydetails();
		batter.displayrunsscored();
		System.out.println();
		Bowler11 bowler = new Bowler11("Jasprit Bumrah", 30, 300);
		bowler.displaydetails();
		bowler.displaywicketstaken();
		System.out.println();
		Allrounder11 allrounder = new Allrounder11("Ravindra Jadeja", 34, 8000);
		allrounder.displaydetails();
		allrounder.displayrunsscored();
		System.out.println();
	}
}