package futuretalentcasestudy;

import java.util.Scanner;

public class QuestionTwo {

	public static int factorialCalculation(int number){
		
		int factorialresult = 1;
		
		for (int i = 2; i <= number; i++) {
			factorialresult = factorialresult * i;
		}
		
		return factorialresult;
	} 
	
	
	public static void main(String[] args) {
		
		int startnumber;
		int count = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start number : " );
		startnumber = scan.nextInt();
		scan.close();
				
		for (int i = 1; i <= startnumber; i++) {
			for (int j = 0; j < i; j++) {					
					System.out.print(count + "!" + " ");
				    count++;
				
			}
			System.out.println("\n");
		}
		
		System.out.println("the end of the above process : ");
		count = 1;
		
		for (int i = 1; i <= startnumber; i++) {
			for (int j = 0; j < i; j++) {					
					System.out.print(factorialCalculation((count)) + " ");
				    count++;
				
			}
			System.out.println("\n");
		}
		
	}
}
