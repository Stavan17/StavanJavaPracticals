package ClassPracticals;
interface Player
{
	void bat();
	void bowl();
}
class Batter implements Player
{
	@Override
	public void bat()
	{
		System.out.println("Batter is batting.");	
	}
	@Override
	public void bowl()
	{
		System.out.println("Batter does not bowl.");
	}
}
class Bowler implements Player
{
	@Override
	public void bat()
	{
		System.out.println("Bowler does not bat.");
	}
	public void bowl()
	{
		System.out.println("Bower is bowling.");
	}
}
public class Prac09
{
	public static void main(String[] args)
	{
		Batter batter = new Batter();
		Bowler bowler = new Bowler();
		System.out.println("Batter actions : ");
		batter.bat();
		batter.bowl();
		System.out.println("\nBowler actions : ");
		bowler.bat();
		bowler.bowl();
	}
}