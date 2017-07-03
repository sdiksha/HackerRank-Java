import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] a)
  	{
  		this.elements = a;
  	}
  	
  	protected void computeDifference()
  	{
  		int min = Integer.MAX_VALUE;
  		int max = Integer.MIN_VALUE;
  		
  		for(int i=0; i< elements.length; i++)
  		{
  			if(elements[i] > max)
  			{
  				max = elements[i];
  			}
  			if(elements[i] < min)
  			{
  				min = elements[i];
  			}
  		}
  		
  		//System.out.println("max: " + max);
  		//System.out.println("min: " + min);
  		this.maximumDifference = Math.abs(max-min);
  		
  	}
}