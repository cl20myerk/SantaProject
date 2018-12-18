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
	static List<String> ages = new ArrayList<String>();
	static List<String> name = new ArrayList<String>();
	static List<String> junk = new ArrayList<String>();

	public static void main(String[] args) throws IOException
	{
		ArrayList<String> niceNames = new ArrayList<String>();
		files();
		niceListGenerator(niceNames);
		nameAgeSort(niceNames);
		ageSort();
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
	}
	public static void niceListGenerator (ArrayList<String> niceListName) throws IOException {
			// scanner r with file declared as static or something in main
			Scanner r = new Scanner(new File("kids.txt")).useDelimiter(",");
			ArrayList<String> naughtyNice = new ArrayList<String>();// array list to just catch all the info so I can sort it
			//ArrayList<String> niceListName = new ArrayList<String>();// array list for names
			while (r.hasNext()) {
				String list = r.nextLine();// takes each line in, so it can be split into naughty and nice
				if (list.contains("naughty")) {
					naughtyNice.add(list);// we don't really need a naughty list, but I add naughty kids to it anyway
				}
				else {
					niceListName.add(list);// add nice people to nice list
				}
			}
	}
	public static void nameAgeSort(ArrayList<String> a) throws IOException
		{
			//List<String> name = new ArrayList<String>();
			//List<String> junk = new ArrayList<String>();
			//List<String> ages = new ArrayList<String>();

			String[] words = {""};
			String tmpK;

			for (int i = 0; i < a.size(); i++)
			{
				tmpK = a.get(i);
				tmpK = tmpK.replaceAll("," , "");
				//tmpK = tmpK.replaceAll(" ", "");
				words = tmpK.split(" ");
				int counter = 1;
				for(String s : words)
				{
					if (counter == 1)
					{
						name.add(s);
					}
					if (counter == 2)
					{
						junk.add(s);
					}
					if (counter == 3)
					{
						ages.add(s);
					}
					if (counter > 3)
					{
						counter = 1;
					}
					counter++;
				}
			}
			//System.out.println(name);
			//System.out.println(junk);
			//System.out.println(ages);
	}
	public static void ageSort()
	{
		int least = 100;
		List<Integer> par1 = new ArrayList<Integer>();
		for(int q = 0; q < ages.size(); q++)
		{
			par1.add(Integer.parseInt(ages.get(q)));
			//par2.add(Integer.parseInt(ages.get(q)));
		}
		List<Integer> par2 = new ArrayList<Integer>(par1);
		Collections.sort(par1);
		System.out.println(par1);
		System.out.println(ages);


		int[] nums = new int[par1.size()];
		for(int i = 0; i < nums.length; i++)
			nums[i] = -1;
		int x = 0;
		for(int i = 0; i < par1.size(); i++)
		{
			nums[x] = (par2.indexOf(par1.get(i))) + x;
			if(nums[x] != -1)
			{
				par1.remove(i);
				par2.remove(x);
				x++;
			}
		}
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "\t");
		}
	}
}