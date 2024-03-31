package ClassPracticals;
import java.io.*;
public class Prac13 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer = new FileWriter("output.txt");
			writer.write("Hello, this is a Java program demonstrating file handling.\n");
			writer.write("We are writing this text to a file using FileWriter.\n");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch (IOException e)
		{
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
		try
		{
			File file = new File("output.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			System.out.println("Contents of the file : ");
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
			reader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
		catch (IOException e)
		{
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}