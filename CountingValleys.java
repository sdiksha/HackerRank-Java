//https://www.hackerrank.com/challenges/counting-valleys?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;

public class CountingValleys
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] steps = s.toCharArray();
		int iValleys = 0;
		int iUp = 0;
		int iDown = 0;
		
		for(int i=0; i< n; i++)
		{
			if(steps[i] == 'U')
			{
				iDown--;
				iUp++;
			}
			else if(steps[i] == 'D')
			{
				iDown++;
				if(iDown > 0 && iUp ==0)
				{
					iValleys++;
				}
				iUp--;
			}			
		}
		
		System.out.println(iValleys);
	}
}
