import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/birthday-cake-candles
public class BirthdayCakecandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int iTemp = 0;
        int iCount = 0;
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > iTemp)
            {
            	iTemp = height[height_i];
            	iCount = 1;
            }
            else if (height[height_i] == iTemp)
            {
            	iCount = iCount + 1;
            }
        }
        System.out.println(iCount);
    }
}
