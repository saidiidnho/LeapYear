import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/* write a program to find a given year is 
		 "Leap Year" or "NOT". (using ternary statement)*/
		/* a leap year is a year that has 366 days instead of 365 days */
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=scan.nextInt();
		
		//int year=2020;
		String result;
		
		result=(year % 4 ==0 ) ? "The "+year+" is a Leap Year." : 
			"The given year "+year+" is NOT a Leap year! please try again!";
		System.out.println(result);
		
		scan.close();

	}

}
