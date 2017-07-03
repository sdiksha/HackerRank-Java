import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/time-conversion
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String sRem = time.substring(2, time.length()-2);
        String sMilTime = "";
        int iHour = 0;
        if(time.substring(time.length()-2, time.length()).equals("PM"))
        {
        	iHour = Integer.parseInt(time.substring(0, 2));
        	if(iHour < 12)
        	{
        		iHour = iHour + 12;
        	}
        	String sHour = String.valueOf(iHour);
        	if (sHour.length() < 2)
        	{
        		sHour = "0" + sHour;
        	}
        	sMilTime = sHour + sRem;
        }
        else
        {
        	iHour = Integer.parseInt(time.substring(0, 2));
        	if(iHour == 12)
        	{
        		iHour = 0;
        		String sHour = String.valueOf(iHour);
            	if (sHour.length() < 2)
            	{
            		sHour = "0" + sHour;
            	}
        		sMilTime = sHour + time.substring(2, time.length()-2);
        	}
        	else
        	{
        		sMilTime = time.substring(0, time.length()-2);
        	}
        }
        
        System.out.println(sMilTime);
    }
}
