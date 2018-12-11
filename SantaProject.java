import java.util.*;
import java.io.FileNotFoundException;
import java.io.*;

public class SantaProject
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Get scanner instance
		Scanner r = new Scanner(new File("kids.txt"));
		ArrayList<String> niceListName = new ArrayList<String>();//create an array to act as the nice list name only
		ArrayList<String> niceListAge = new ArrayList<String>();//array list (parallel) for nice peoples names
		ArrayList<String> bassProShop = new ArrayList<String>();// array list to just catch all the info so I can sort it
		String name, naughtyNice;
		int age;

		//Set the delimiter used in file
		r.useDelimiter(",");

		while (r.hasNext()) {
			//System.out.println (r.next());
			bassProShop.add(r.next());

		}
		r.close();// close scanner, just because

		//prints out what net has to be sure

		for (String elem : bassProShop) {
			System.out.println(elem);
		}


		//searches throught the net to find nice people, adds their name and age to list
		for (int x = 0; x < bassProShop.size(); x += 3) {
			if (bassProShop.get(x + 1).equals(" nice")) {
				niceListName.add(bassProShop.get(x));
				niceListAge.add(bassProShop.get(x + 2));
			}
		}

		// print out the nice list
		for (String s : niceListName)
			System.out.println (s);

		for (String e : niceListAge)
			System.out.println (e);


    }
}