import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int iSum = 0;
        int iLargestSum = -1000;
        
        for(int l=0; l < 4; l++) //Row
        {
        	for(int k=0; k < 4; k++) //Column
            {
        		iSum = 0;
            	for(int i=l; i < (l+3); i++) //Row
                {
            		if(i == (l+1)) //Center element of the hour glass in second row
            		{
            			//System.out.print(arr[i][k+1] + " "); 
            			iSum = iSum + arr[i][k+1];
            		}
            		else
            		{
            			for(int j=k; j < (k+3); j++) //Column
                        {
                        	//System.out.print(arr[i][j] + " ");   
                        	iSum = iSum + arr[i][j];
                        }
            		}
                    //System.out.println();
                }  
            	if(iSum > iLargestSum)
            	{
            		iLargestSum = iSum;
            	}
            }
        	//System.out.println("Next Column");
        } 
        
        System.out.println(iLargestSum);
    }
}
