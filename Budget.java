import java.util.*;
import java.io.*;

public static void budget(int price)
{
	int amount;
	int num2 = 0;
	int maxPrice = 0;
	Scanner hugeScanner = new Scanner(System.in);

	System.out.println("Santa, how much money can we spend before our budget it reached? And HO HO HO Merry Christmas!");
	amount = hugeScanner.nextInt();

	maxPrice = amount;

	for(int j = 0; j <= price.size(); j++)
	{
		num2 = Integer.parseInt(price.get(j));
		if(num2 < amount)
		{
			index.add(i);
			num2++;

		}
		if(num2 >= maxPrice)
		{
			System.out.println("Santa, you have reached your budget.");
		}
	}
