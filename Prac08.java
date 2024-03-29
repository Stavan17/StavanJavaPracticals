package javapractice;
class Player1
{
	String name;
	public Player1(String name)
	{
		this.name = name;
	}
	public void play()
	{
		System.out.println("Player is playing : ");
	}
}
class Batter1 extends Player1
{
	public Batter1(String name)
	{
		super(name);
	}
	@Override
	public void play()
	{
		System.out.println(name + " is batting.");
	}
}
class Bowler1 extends Player1
{
	public Bowler1(String name)
	{
		super(name);
	}
	@Override
	public void play()
	{
		System.out.println(name + " is bowling.");
	}
}
public class Prac08
{
	public static void main(String[] args)
	{
		Player1 player1 = new Batter1("Rohit");
		Player1 player2 = new Bowler1("Jasprit");
		player1.play();
		player2.play();
	}
}