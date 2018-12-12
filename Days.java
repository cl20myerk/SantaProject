import java.util.*;
import java.io.*;

public static void days() throws IOException
{
		int index = 0;

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

				for(int i = 0; i <= days.size(); i++)
				{
					int num = Integer.parseInt(days.get(i));
					if(num < numDays)
						index.add(i)
				}
				System.out.println(index);
				break;
			case 2:
				System.out.println("We have 16 days to build the gifts, Santa!");

				for(int i = 0; i <= days.size(); i++)
					{
						int num = Integer.parseInt(days.get(i));
						if(num < numDays)
							index.add(i)
					}
				System.out.println(index);

				break;
			case 3:
				System.out.println("We have 5 days to build the gifts, Santa!");

				for(int i = 0; i <= days.size(); i++)
				{
					int num = Integer.parseInt(days.get(i));
					if(num < numDays)
						index.add(i)
				}
				System.out.println(index);

				break;
			case 4:
				System.out.println("We have 5 days to build the gifts, Santa!");

				for(int i = 0; i <= days.size(); i++)
				{
					int num = Integer.parseInt(days.get(i));
					if(num < numDays)
						index.add(i)
				}
				System.out.println(index);

				break;
			default:
				System.out.println("You didn't pick a viable test Santa!");
				break;
			}
	}
}