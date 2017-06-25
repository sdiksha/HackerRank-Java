//https://www.hackerrank.com/challenges/cats-and-a-mouse?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatAndMouse
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int catA = Math.abs(x-z);
            int catB = Math.abs(y-z);
            
            if(catA > catB)
            {
            	System.out.println("Cat B");
            }
            else if(catA < catB)
            {
            	System.out.println("Cat A");
            }
            else
            {
            	System.out.println("Mouse C");
            }
        }
	}
}
