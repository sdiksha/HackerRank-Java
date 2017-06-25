//https://www.hackerrank.com/challenges/reduced-string?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString
{

	public static void main(String[] args) 
	{
        System.out.println(super_reduced_string("aaabccddd"));
        System.out.println(super_reduced_string("baab"));
        System.out.println(super_reduced_string("aa"));
	}
	
	public static String super_reduced_string(String s)
	{
		String res = "";
		
		if(!s.isEmpty())
		{
			res = String.valueOf(s.charAt(0));
			//System.out.println("new res: " + res);
		}
		
		for(int i = 1; i< s.length(); i++)
		{
			if(res.length() > 0 && s.charAt(i) == res.charAt(res.length()-1))
			{
				if(res.length() > 1 )
				{
					res = res.substring(0, res.length()-1);
					//System.out.println("updated res: " + res);
				}
				else
				{
					res = "";
				}
			}
			else if (res.length() == 0)
			{
				res = String.valueOf(s.charAt(i));
			}
			else if(res.length() > 0 && s.charAt(i) != res.charAt(res.length()-1))
			{
				res = res + String.valueOf(s.charAt(i));
			}
			
			//System.out.println("new res: " + res);
		}

		if(res.isEmpty())
		{
			res = "Empty String";
		}
		return res;
    }

}
