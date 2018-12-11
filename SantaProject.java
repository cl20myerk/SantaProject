import java.util.*;
import java.io.*;

public class SantaProject
{
	public static void main(String[] args) throws IOException
	{
		Scanner gifts = new Scanner(new FileReader("gifts.txt"));
		Scanner kids = new Scanner(new FileReader("kids.txt"));

		List<String> gList = new ArrayList<String>();
		List<String> kList = new ArrayList<String>();

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
		giftsInfo(gList);
	}
	public static void giftsInfo(List<String> gList) throws IOException
	{

		Scanner gifts = new Scanner(new FileReader("gifts.txt"));

		List<String> name = new ArrayList<String>();
		List<String> min = new ArrayList<String>();
		List<String> max = new ArrayList<String>();
		List<String> price = new ArrayList<String>();
		List<String> days = new ArrayList<String>();


		int x = 0;

		while(gifts.hasNext())
		{
			name.add(gifts.nextLine());
			min.add(gifts.nextLine());
			max.add(gifts.nextLine());
			price.add(gifts.nextLine());
			days.add(gifts.nextLine());

			System.out.println(name.get(x));
			System.out.println(min.get(x));
			System.out.println(max.get(x));
			System.out.println(price.get(x));
			System.out.println(days.get(x));
			x++;
		}
	}
}
