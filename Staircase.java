import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/staircase
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0; i< n; i++)
        {
        	for(int j=0; j< n-1-i; j++)
        	{
        		System.out.print(" ");
        	}
        	
        	for(int j=0; j <i+1; j++)
        	{
        		System.out.print("#");
        	}
        	System.out.println();
        }
    }
}
