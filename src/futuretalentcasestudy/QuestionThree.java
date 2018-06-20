package futuretalentcasestudy;

import java.util.Scanner;

public class QuestionThree {
	
	public static double[] squareRootCalculation(double number) {
		
		double [] sqrtroot = new double [5];
		sqrtroot[0] = (1 + number/1)/2;
		
		for (int i = 1; i < 5; i++) {
			sqrtroot[i] = (sqrtroot[i-1] + (number/sqrtroot[i-1]))/2;
		}
		
		return sqrtroot;
	}

	public static void disPlay(double [] sqrtrootresult) {
		for (int i = 0; i < sqrtrootresult.length; i++) {
			System.out.println((i+1) + ". kök " + sqrtrootresult[i]);
		}
	}
	
	public static void main(String[] args) {
		
		double sqrtnumber;
		double [] sqrtrootresult = new double [5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to calculate square root : ");
		sqrtnumber = scan.nextDouble();
		scan.close();
		
		sqrtrootresult = squareRootCalculation(sqrtnumber);
		disPlay(sqrtrootresult);
		
		
		
	}
}
