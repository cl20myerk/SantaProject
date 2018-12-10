import java.util.*;
import java.io.*;

public class Days
{
	public static void main (String[] args) throws IOException
	{
		Scanner gifts = new Scanner(new FileReader("gifts.txt"));
		Scanner kids = new Scanner(new FileReader("kids.txt"));
		Scanner reader = new Scanner(System.in);

		List<String> gList = new ArrayList<String>();
		List<String> kList = new ArrayList<String>();

		String tmpG = "";
		String tmpK = "";
		String[] words = {""};

		int choice;

		System.out.println("Pick a test number: ");
		System.out.println("1)\tTest1");
		System.out.println("2)\tTest2");
		System.out.println("3)\tTest3");
		System.out.println("4)\tTest4");
		choice = reader.nextInt();

		switch(choice)
		{
			case 1:
				System.out.println("We have 16 days to build the gifts, Santa!");
				while (gifts.hasNext())
				{
					tmpG = gifts.nextLine();

				}

				break;
			case 2:
				System.out.println("We have 16 days to build the gifts, Santa!");

				break;
			case 3:
				System.out.println("We have 5 days to build the gifts, Santa!");

				break;
			case 4:
				System.out.println("We have 5 days to build the gifts, Santa!");

				break;
			default:
				System.out.println("You didn't pick a viable test Santa!");
				break;
			}


	}
}