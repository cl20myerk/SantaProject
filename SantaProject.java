import java.util.*;
import java.io.*;

public class SantaProject
{
	static List<String> gList = new ArrayList<String>();
	static List<String> kList = new ArrayList<String>();

	public static void main(String[] args) throws IOException
	{
		Scanner gifts = new Scanner(new FileReader("gifts.txt"));
		Scanner kids = new Scanner(new FileReader("kids.txt"));

		String tmpG = "";
		String tmpK = "";
		String[] words = {""};

		while(gifts.hasNext())
		{
			tmpG = gifts.nextLine();
			//System.out.println(tmpG);
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
				//System.out.println(s);
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
		giftsInfo();
	}
	public static void giftsInfo()
	{
		List<String> name = new ArrayList<String>();
		List<Integer> min = new ArrayList<Integer>();
		List<Integer> max = new ArrayList<Integer>();
		List<Integer> price = new ArrayList<Integer>();
		List<Integer> days = new ArrayList<Integer>();
	}
}
