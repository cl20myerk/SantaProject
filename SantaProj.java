import java.util.*;
import java.io.*;

public class SantaProj
{
	public static void main (String[] args) throws IOException
	{
		//declare variables
		Scanner input = new Scanner(System.in);
		double budget;
		int buildDays, left;

		//take input from user
		System.out.println ("What is the budget?");
		budget = input.nextInt();
		System.out.println ("How many days to build?");
		buildDays = input.nextDouble();
		
		//from giftMethod...
		Scanner gifts = new Scanner(new FileReader("gifts.txt"));
		List<String> game = new ArrayList<String>();
		List<Integer> min = new ArrayList<Integer>();
		List<Integer> max = new ArrayList<Integer>();
		List<Double> price = new ArrayList<Double>();
		List<Integer> days = new ArrayList<Integer>();

		while(gifts.hasNext())
		{
			game.add(gifts.nextLine());
			min.add(gifts.nextInt());
			max.add(gifts.nextInt());
			price.add(gifts.nextDouble());
			days.add(gifts.nextInt());
		}
		//close the scanner 
        	gifts.close();
		
		//iterate for name, etc. 
		Scanner kids = new Scanner(new FileReader("kids.txt.")); 
		List<String> name = new ArrayList<String>(); 
		List<String> behave = new ArrayList<String>(); 
		List<Integer> age = new ArrayList<Integer>(); 
		
		//Set the delimiter used in file
        	kids.useDelimiter(",");
         
        	while (kids.hasNext())
        	{
            		name.add(kids.nextLine()); 
            		behave.add(kids.nextLine()); 
            		age.add(kids.nextInt()); 
        	}
        	//close the scanner 
        	kids.close();

		/*
		naughty/nice method...
			check ages...sort in order?
			assign present w/ if:
			if (days < buildDays && price < budget)
			{
				presents.add(game); 	//create array list of presents for parallel array with names
				budget = budget - price;	//not sure if condition will completely work for all to get presents
			}
		*/
		
	}//end main
}
