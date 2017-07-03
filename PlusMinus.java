import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/plus-minus
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double dGreaterThanZero = 0;
        double dLessThanZero = 0;
        double dEqualToZero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] < 0)
            {
            	dLessThanZero = dLessThanZero + 1.00;
            }
            else if (arr[arr_i] > 0)
            {
            	dGreaterThanZero = dGreaterThanZero + 1.00;
            }
            else
            {
            	dEqualToZero = dEqualToZero + 1.00;
            }
        }
        String sGreaterThanZero = String.valueOf(dGreaterThanZero/n);
        if(sGreaterThanZero.length() < 8)
        {
        	while(sGreaterThanZero.length() < 8)
            {
            	sGreaterThanZero = sGreaterThanZero + "0";
            }
        }
        else if(sGreaterThanZero.length() > 8)
        {
        	while(sGreaterThanZero.length() > 8)
            {
            	sGreaterThanZero = sGreaterThanZero.substring(0,  sGreaterThanZero.length()-1);
            }
        }

        System.out.println(sGreaterThanZero);
        
        
        String sLessThanZero = String.valueOf(dLessThanZero/n);
        if(sLessThanZero.length() < 8)
        {
        	while(sLessThanZero.length() < 8)
            {
        		sLessThanZero = sLessThanZero + "0";
            }
        }
        else if(sLessThanZero.length() > 8)
        {
        	while(sLessThanZero.length() > 8)
            {
        		sLessThanZero = sLessThanZero.substring(0,  sLessThanZero.length()-1);
            }
        }
        
        System.out.println(sLessThanZero);
        
        String sEqualThanZero = String.valueOf(dEqualToZero/n);
        if(sEqualThanZero.length() < 8)
        {
        	while(sEqualThanZero.length() < 8)
            {
        		sEqualThanZero = sEqualThanZero + "0";
            }
        }
        else if(sEqualThanZero.length() > 8)
        {
        	while(sEqualThanZero.length() > 8)
            {
        		sEqualThanZero = sEqualThanZero.substring(0,  sEqualThanZero.length()-1);
            }
        }
        
        System.out.println(sEqualThanZero);
    }
}
