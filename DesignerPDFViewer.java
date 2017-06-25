//https://www.hackerrank.com/challenges/designer-pdf-viewer?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DesignerPDFViewer
{
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++)
        {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int iMaxHt = 0;
        int iIndex = -1;
        for(int i=0; i < word.length(); i++)
        {
        	//System.out.println("character: " + word.charAt(i)); 
        	iIndex = word.charAt(i)-97;
        	//System.out.println("iIndex: " + iIndex);
        	if(iMaxHt < h[iIndex])
        	{
        		iMaxHt = h[iIndex];
        	}       	
        }
        
        System.out.println(iMaxHt* word.length());
    }

}
