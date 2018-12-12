/*
Kyle Myer
Dylan Tull
Erin
Chris Kramer
Ronin
*/
import java.util.*;
import java.io.*;

public class SantaProject
{
	static List<String> gList = new ArrayList<String>();
	static List<String> kList = new ArrayList<String>();

	public static void main(String[] args) throws IOException
	{
		files();
		giftsInfo();
	}

	public static void files() throws IOException
	{
		Scanner gifts = new Scanner(new FileReader("gifts.txt"));
		Scanner kids = new Scanner(new FileReader("kids.txt"));

		String tmpG = "";
		String tmpK = "";
		String[] words = {""};

		while(gifts.hasNext())
		{
			gList.add(gifts.nextLine());

		}
		while(kids.hasNext())
		{
			tmpK = kids.nextLine();
			tmpK = tmpK.replaceAll("," , "\t");
			tmpK = tmpK.replaceAll(" ", "");
			words = tmpK.split(" ");
			for(String s: words)
			{
				kList.add(s);
			}
		}
		for(int i = 0; i < kList.size(); i++)
		{
			if(kList.get(i).contains("naughty"))
			{
				kList.remove(i);
			}
		}
		//System.out.println(kList);
	}
	public static void giftsInfo() throws IOException
	{
		Scanner r = new Scanner(System.in);
		int numDays = 0;
		int num = 0;
		List<Integer> index = new ArrayList<Integer>();

		System.out.println("How many days do we have?");
		numDays = r.nextInt();

		Scanner gifts = new Scanner(new FileReader("gifts.txt"));

		List<String> name = new ArrayList<String>();
		List<String> min = new ArrayList<String>();
		List<String> max = new ArrayList<String>();
		List<String> price = new ArrayList<String>();
		List<String> days = new ArrayList<String>();

		while(gifts.hasNext())
		{
			name.add(gifts.nextLine());
			min.add(gifts.nextLine());
			max.add(gifts.nextLine());
			price.add(gifts.nextLine());
			days.add(gifts.nextLine());
		}
		for(int i = 0;i < days.size(); i++)
		{
			num = Integer.parseInt(days.get(i));
			if(num < numDays)
			index.add(i);
		}
		System.out.println(index);

	}
}