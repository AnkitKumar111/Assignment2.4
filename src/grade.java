/*
A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B
grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and C
grade, if marks are less than 61 (marks less than 45 for age < 15) Write a program to
print the grade for given marks and age.
*/
import java.util.Scanner;
public class grade {	
	 public static void calculate(){
		 int mark[] = new int[5];
	        int i,age;
	        float sum=0, avg;
	      //creating object for scanner class
	        Scanner sc1 = new Scanner(System.in);
	        Scanner sc2 = new Scanner(System.in);
	      //taking input form user using object of scanner class
	        System.out.println("Enter age of student : ");
	        age=sc1.nextInt();
	        System.out.println("Enter marks of 5 subjects : ");
	        for(i=0; i<5; i++)
	        {
	            mark[i] = sc2.nextInt();
	            sum = sum + mark[i];
	        }		
	        avg = (sum/500)*100;
	        sc1.close();
	        sc2.close();
	        System.out.println("your age is: " + age);
	        System.out.print("your grade is:");     
	        //nested if else to calculate grade
	        if(age>15)
	        {
	        	if(avg>70)
	            {
	                System.out.print("A");
	            }
	            else if(avg>=61 && avg<=70)
	            {
	                System.out.print("B");
	            }
	            else if(avg<60)
	            {
	                System.out.print("C");
	            }	            
	        }
	        else
	        {
	        	if(avg>60)
	            {
	                System.out.print("A");
	            }
	            else if(avg>=45 && avg<=60)
	            {
	                System.out.print("B");
	            }
	            else if(avg<=45)
	            {
	                System.out.print("C");
	            }	            
	        }	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object for class grade
		grade obj = new grade();
		//invoking method with the help of object
		obj.calculate();
	}
}
