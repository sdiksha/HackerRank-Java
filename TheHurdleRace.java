//https://www.hackerrank.com/challenges/the-hurdle-race?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=3-day-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheHurdleRace
{
	/*
	100 47
	52 99 93 84 50 64 61 87 89 97 64 69 61 90 82 53 50 63 82 87 76 78 75 55 80 68 75 83 69 81 95 89 60 59 90 100 90 64 53 60 88 93 62 50 75 77 60 93 55 79 52 47 65 74 62 60 96 49 73 92 79 54 100 81 63 58 75 80 89 94 52 85 57 72 97 81 97 66 84 77 83 94 85 68 99 54 64 83 67 84 81 65 59 89 68 91 60 79 74 57
	*/
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int iBoost = 0;
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++)
        {
            height[height_i] = in.nextInt();
        }
        
        Arrays.sort(height);
        
        iBoost = Math.max(height[height.length-1]-k, 0);
        
        System.out.println(iBoost);
    }

}
