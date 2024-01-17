package ClassPracticals;
class hello
{
	private double width, height, depth;
	public hello()
	{
		width = 10;
		height = 10;
		depth = 10;
	}
	public hello(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double getwidth()
	{
		return width;
	}
	public void setwidth(double width)
	{
		this.width = width;
	}
	public double getheight()
	{
		return height;
	}
	public void setheight(double height)
	{
		this.height = height;
	}
	public double getdepth()
	{
		return depth;
	}
	public void setdepth(double depth)
	{
		this.depth = depth;
	}
	public void volume()
	{
		System.out.println("Volume is " + width*depth*height);
	}
	public void finalize() throws Throwable
	{
		System.out.println("My box object is garbage collected");
	}
}
public class Prac05
{
	public static void main(String[] args)
	{
		hello mybox1 = new hello();
		mybox1.setheight(20);
		mybox1.setdepth(30);
		mybox1.volume();
		mybox1 = null;
		System.gc();
		hello mybox2 = new hello(15, 35, 12);
		mybox2.volume();
	}
}