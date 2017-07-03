import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/grading
public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int grade = 0;
        for(int a0 = 0; a0 < n; a0++){
            grade = in.nextInt();
            a[a0] = grade;
        }
        for(int a0 = 0; a0 < n; a0++)
        {
        	grade = a[a0];
        	if(grade < 38)
            {
            	System.out.println(grade);
            }
            else
            {
            	int iDiv = grade/5;
            	iDiv = iDiv + 1;
            	int iHigh = iDiv * 5;
            	
            	if((iHigh - grade ) < 3)
            	{
            		grade = iHigh;
            	}
            	
            	System.out.println(grade);
            }
        }
    }
}
