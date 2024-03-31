package ClassPracticals;
class cricketplayer extends Thread
{
	private String playername;
	private int ballsplayed;
	public cricketplayer(String playername)
	{
		this.playername = playername;
		this.ballsplayed = 0;
	}
	public void run()
	{
		System.out.println(playername + " is batting ...");
		while (ballsplayed < 6)
		{
			ballsplayed++;
			System.out.println(playername + " is facing ball " + ballsplayed);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(playername + " was interrupted while batting");
			}
		}
		System.out.println(playername + " has finished batting.");
	}
}
public class Prac11 {
	public static void main(String[] args)
	{
		cricketplayer player1 = new cricketplayer("Rohit");
		cricketplayer player2 = new cricketplayer("Virat");
		player1.start();
		player2.start();
		try
		{
			player1.join();
			player2.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread was interrupted");
		}
		System.out.println("Both players have finished batting. Match Over !");
	}
}