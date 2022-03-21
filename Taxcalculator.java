package taxCalculation;

import java.util.Scanner;

public class Taxcalculator {

	public static void main(String[] args) {
		System.out.println("TAX CALCULATOR");
	
		int sal=0;
		double percent=0;
		int difference=0;
		
		Scanner scanner=new Scanner(System.in);
		
			System.out.print("Enter salary: ");
			sal=scanner.nextInt();
			if (sal>100000 && sal<300000  ) {
				difference=(sal-100000);
				percent=0.2;
			}
		
		else if (sal>=300000) {
				difference=(sal-250000);
				percent=0.3;
			}
		
		else if(sal<=100000)
			System.out.println("you have no tax");
		
			double tax=difference*percent;
			
			System.out.print("SALARY: " + sal + "	" + "TAX: " + tax);
		
		
		
	/*4. out put the entered salary and corresponding tax*/
	
	}
}
