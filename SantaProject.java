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
			}
		}
		for(int i = 0; i < kList.size(); i++)
		{
			if(kList.get(i).contains("naughty"))
			{
				kList.remove(i);
			}
		}
		System.out.println(kList);
	}
}