import java.util.*;
import java.io.*;

public static void days(int days) throws IOException
{
	Scanner santa = new Scanner(System.in);
	int numDays;
	int num;

	System.out.println("Santa, how many days do we have to build the gifts?");
	numDays = santa.nextInt();

	for(int i = 0; i <= days.size(); i++)
	{
		int num = Integer.parseInt(days.get(i));
		if(num < numDays)
			index.add(i)
	}
	System.out.println(index);
}