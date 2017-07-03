import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/a-very-big-sum
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        BigInteger biSum = BigInteger.ZERO;
        
        for(int i=0; i< n; i++)
        {
        	biSum = biSum.add(BigInteger.valueOf(arr[i]));
        }
        
        System.out.println(biSum);
    }
}
