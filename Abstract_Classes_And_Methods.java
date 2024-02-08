package javapractice;
abstract class Player2
{		
	String name;
	public Player2(String name)
	{
		this.name = name;
	}
	public abstract void play();
}
class Batter2 extends Player2
{
	public Batter2(String name)
	{
		super(name);
	}
	@Override
	public void play()
	{
		System.out.println(name + " is batting.");
	}
}
class Bowler2 extends Player2
{
	public Bowler2(String name)
	{
		super(name);
	}
	@Override
	public void play()
	{
		System.out.println(name + " is bowling.");
	}
}
public class Abstract_Classes_And_Methods
{
	public static void main(String[] args)
	{
		Player2 player1 = new Batter2("Rohit");
		Player2 player2 = new Bowler2("Jasprit");
		player1.play();
		player2.play();
	}
}