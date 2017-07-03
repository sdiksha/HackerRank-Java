import java.util.*;

public class Student extends Person{
	private static int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

	Student(String firstName, String lastName, int identification, int[] scores)
	{
		super(firstName,lastName,identification);
		this.testScores = scores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public static char calculate()
	{
		char grade = ' ';
		int iSum = 0;
		for(int i=0; i< testScores.length; i++)
		{
			iSum = iSum + testScores[i];
		}
		
		iSum = iSum /testScores.length;
		
		if(iSum >= 90)
		{
			grade = 'O';
		}
		else if(iSum >=80 && iSum< 90)
		{
			grade = 'E';
		}
		else if(iSum>=70 && iSum < 80)
		{
			grade = 'A';
		}
		else if (iSum >=55 && iSum < 70)
		{
			grade = 'P';
		}
		else if(iSum >=40 && iSum < 55)
		{
			grade = 'D';
		}
		else
		{
			grade = 'T';
		}
		
		return grade;
	}
}