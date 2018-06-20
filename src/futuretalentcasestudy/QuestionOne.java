package futuretalentcasestudy;

import java.util.Scanner;

public class QuestionOne {
	
	public static double distanceCalculation(int  coordx1, int coordy1,	int coordx2, int coordy2) {
		
	   double result;
	   result = Math.pow((coordx1-coordx2), 2) + Math.pow((coordy1 - coordy2), 2);
	   result = Math.sqrt((result));
		
		return result;
		
	}
	public static double minNumberFind(double first, double second, double third) {
		
		double minnumber = first;
		
		if(second < minnumber)
			minnumber = second;
		if(third < minnumber)
			minnumber = third;
		
		return minnumber;
	}
	
	public static void main(String[] args) {
		
		double mindistance, distancex1, distancex2, distancex3;
		int coordx1, coordy1;
		int coordx2, coordy2;
		int coordx3, coordy3;
		int coordx4, coordy4;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first point's coordinates : " );
	    coordx1 = scan.nextInt();	
	    coordy1 = scan.nextInt();
	    
	    System.out.print("Enter second point's coordinates : " );
	    coordx2 = scan.nextInt();	
	    coordy2 = scan.nextInt();
	    
	    System.out.print("Enter third point's coordinates : " );
	    coordx3 = scan.nextInt();	
	    coordy3 = scan.nextInt();
		
	    System.out.print("Enter fourth point's coordinates : " );
	    coordx4 = scan.nextInt();	
	    coordy4 = scan.nextInt();
	    
		scan.close();
		mindistance  = minNumberFind(distanceCalculation(coordx1, coordy1, coordx2, coordy2), distanceCalculation(coordx1, coordy1, coordx3, coordy3),
				distanceCalculation(coordx2, coordy2, coordx3, coordy3));
		distancex1 = distanceCalculation(coordx4, coordy4, coordx1, coordy1);
		distancex2 = distanceCalculation(coordx4, coordy4, coordx2, coordy2);
		distancex3 = distanceCalculation(coordx4, coordy4, coordx3, coordy3);
		
		if (distancex1 <= mindistance && distancex2 <= mindistance && distancex3 <= mindistance) {
			System.out.println("The fourth point is in triangle.");
			
		}
		else {
			System.out.println("The fourth point isn't in triangle.");
		}
		
	}

}
