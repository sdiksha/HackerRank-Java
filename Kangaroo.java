//https://www.hackerrank.com/challenges/kangaroo?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Kangaroo
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
	}

	public static String kangaroo(int x1, int v1, int x2, int v2) 
	{
		String result = "NO";
		
		if((x1-x2 > 0) && (v2-v1 > 0))
		{
			if(((x1-x2)%(v2-v1)) == 0)
			{
				result = "YES";
			}
		}
		else if((x1-x2 < 0) && (v2-v1 < 0))
		{
			if(((x1-x2)%(v2-v1)) == 0)
			{
				result = "YES";
			}
		}
		
        return result;
    }

}
