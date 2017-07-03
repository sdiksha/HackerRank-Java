import java.io.*;
import java.util.*;

public class Calculator implements AdvancedArithmetic{

	public int divisorSum (int n)
	{
		int sum = 1;
		if(n ==1)
		{
			return sum;
		}
		for(int i=2; i<= n/2; i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
			}
		}
		sum = sum + n;
		return sum;
	}
	
}
