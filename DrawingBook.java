//https://www.hackerrank.com/challenges/drawing-book?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=3-day-campaign4
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook
{
	static int solve(int n, int p)
	{
		int res = 0;
		int res1 = 0;
		int res2 = 0;
		
		if(n < p)
		{
			return -1;
		}
		else
		{
			if(n%2 != 0)
			{
				res1 = (n-p)/2;
				res2 = p/2;
			}
			else
			{
				if(p%2 ==0)
				{
					res1 = (n-p)/2;
				}
				else
				{
					res1 = ((n-p)/2) + 1;
				}
				
				res2 = p/2;
			}
			res = Math.min(res1, res2);
		}
		
		return res;
	}

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
