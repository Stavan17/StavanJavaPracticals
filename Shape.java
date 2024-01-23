package javapractice;
public class Shape
{
	private String sname;
	private int sides;
	private int area;
	public Shape()
	{
		this.sname = "Triangle";
		this.sides = 3;
	}
	public Shape(String sname, int sides)
	{
		this.sname = sname;
		this.sides = sides;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public boolean equals(Shape shape)
	{
		if (this == shape)
		{
			return true;
		}
		if (this.sname.equals(shape.sname))
		{
			return true;
		}
		return false;
	}
	public void finalize() throws Throwable
	{
		System.out.println("Finalizing Shape Object : " + this.toString());
	}
	public String toString()
	{
		return "Shape [sname = " + sname + ", sides = " + sides + "]";
	}
	public void displayInfo()
	{
		area = 4 * sides;
		System.out.println("Shape : " + sname + ", Area : " + area);
	}
	public int compareTo(Shape shape)
	{
		if (this.sides > shape.sides)
		{
			return 1;
		}
		else if (this.sides < shape.sides)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Shape circle = new Shape("Circle", 0);
		Shape square = new Shape("Square", 4);
		System.out.println(circle.compareTo(square));
		System.out.println(circle.equals(square));
		System.out.println(circle);
		square.displayInfo();
		square = null;
		System.gc();
	}
}