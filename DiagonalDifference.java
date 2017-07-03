import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/diagonal-difference
public class DiagonalDifference {
	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int iSum1 = 0;
        int iSum2 = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if(i==j)
                {
                	iSum1 = iSum1 + a[i][j];
                }
            }
        }
        int k = n;
        for(int i=0; i < n; i++){
    		k=k-1;
            iSum2 = iSum2 + a[i][k];
        } 
        
        System.out.println(Math.abs(iSum1 - iSum2));
    }
}


