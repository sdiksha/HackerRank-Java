import java.io.*;
import java.util.*;

public class Person {
    private int age;	
    protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	/*public Person(int initialAge) {
  		if(initialAge < 0)
  		{
  			this.age = 0;
  			System.out.println("Age is not valid, setting age to 0.");
  		}
  		else
  		{
  			this.age = initialAge;
  		}
	}*/
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}

	/*public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		if(age < 13)
		{
			System.out.println("You are young.");
		}
		else if(age >=13 && age <18)
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are old.");
		}
			
	}

	public void yearPasses() {
  		age = age +1;
	}*/
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }*/
}