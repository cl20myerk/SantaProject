import java.util.*;
import java.io.*;

public class SantaProj
{
	public static void main (String[] args) throws IOException
	{
		//declare variables
		Scanner r = new Scanner(System.in);
		double amount = 0;
		int numDays = 0;

		//scanner of gifts input
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
		gifts.close();

		//get input from user
		System.out.println("Santa, how much money can we spend before our budget it reached? And HO HO HO Merry Christmas!");
		amount = r.nextInt();
		System.out.print ("How many days to build:\t");
		numDays = r.nextInt();

		System.out.println ("amt:" + amount + "days:" + numDays);
/*
		//go through methods
		//get list of nice kids




	}//end main

	//naughty/nice method
	public static List<String> niceListGenerator() throws IOException
	{
		// scanner r with file declared as static or something in main
		Scanner r = new Scanner(new File("kids.txt")).useDelimiter(",");
		ArrayList<String> naughtyNice = new ArrayList<String>();// array list to just catch all the info so I can sort it
		ArrayList<String> niceListName = new ArrayList<String>();// array list for names
		while (r.hasNext())
		{
			String list = r.nextLine();// takes each line in, so it can be split into naughty and nice
			if (list.contains("naughty"))
			{
				naughtyNice.add(list);// we don't really need a naughty list, but I add naughty kids to it anyway
			}
			else
			{
				niceListName.add(list);// add nice people to nice list
			}
		}
		r.close();
		//return nicelist
		return niceListName;
	}//end method

	//age method...just for nice kids
	public static List<String> nameAgeSort(List<String> niceListName) throws IOException
	{
		//declare variables
		List<String> ages = new ArrayList<String>();
		Scanner kids = new Scanner (new File("kids.txt"));

		//assign input to list
		while (kids.hasNext())
		{
			String list = kids.nextLine();

			//iterate through list
			String[] words = {""};
			String tmpK;

			list = list.replaceAll("," , "");
			//tmpK = tmpK.replaceAll(" ", "");
			words = list.split(" ");
			if (words[1].equals("nice"))
			{
				ages.add(words[2]);
			}//end if
		}//end while
		kids.close();

		return ages;
	}//end method

	//budget method -- if go over price limit
	public static void budget(List<String> price, double maxPrice, double amount)		//use for checking budget after adding counts
	{
		//declare variables
		int num2 = 0;
		List<Integer> index = new ArrayList<Integer>();

		//--take out for loop and just continuously call in main
		for(int j = 0; j <= price.size(); j++)
		{
			num2 = Integer.parseInt(price.get(j));
			if(num2 < amount)
			{
				index.add(j);	//marks which are within budget limit
				num2++;
			}
			if(num2 >= maxPrice)
			{
				System.out.println("Santa, you have reached your budget.");
				//call gifting method
			}
		}
	}//end method

	//get days to build
	public static List<Integer> buildDays(int numDays, List<String> days)
	{
		//declare
		List<Integer> index = new ArrayList<Integer>();

		//determine if go over day limit
		for(int i = 0;i < days.size(); i++)
		{
			int num = Integer.parseInt(days.get(i));
			if(num < numDays)
				index.add(i);		//for every index of index that is filled marks presents to fit time limit
		}
		System.out.println(index);

		return index;
	}//end method*/
}//end program
