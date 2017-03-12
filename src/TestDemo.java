/*
program TestDemo.java, which accepts the number as argument and print “You
Have Entered Zero” if the value is equal to 0.
It should print “You Have Entered Positive Value” if the value is greater than 0.
It should print “You Have Entered Negative Value” if the value is less than 0.
 */
public class TestDemo {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//taking input using command line arguments
		int n1 = Integer.parseInt(args[0]);
		if(n1 == 0)
			System.out.println("You have entered ZERO ");
		else if (n1 < 0)
			System.out.println("You have entered Negetive value ");
		else 
			System.out.println("You have entered positive value ");

	}

}
/*Click on Run -> Run Configurations
Click on Arguments tab
In Program Arguments section , Enter your arguments.
Click Apply and Run*/