package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		int max = Math.max(input, input2);
		int min = Math.min(input, input2);
		
		for (int i = 0; i < 100; i++ ) {
		System.out.print((int) (Math.random () * ((max - min + 1)) + min) + " ");
		
		
		
		}
		
		System.out.println("\n");
		
	}


	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("What is the radius of the cylinder: ");
		double r = inKey.nextDouble();
		System.out.print("What is the height of the cylinder: ");
		double h = inKey.nextDouble();
		double volume = Math.PI * (r * r) * h;
		System.out.print("The volume of the cylinder is " + volume + ". \n");
		
		System.out.println("\n");
		
	}


	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("What is X1: \n");
		double xone = inKey.nextDouble();
		System.out.print("What is Y1: \n");
		double yone = inKey.nextDouble();
		System.out.print("What is X2: \n");
		double xtwo = inKey.nextDouble();
		System.out.print("What is Y2: \n");
		double ytwo = inKey.nextDouble();
		
		System.out.println("Distance between points = " + Math.sqrt(((ytwo-yone)*(ytwo-yone))+((xtwo-xone)*(xtwo-xone))) + ". \n");
		
		
		
	}

	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("What is the a-value: \n");
		double aVal = inKey.nextDouble();
		System.out.print("What is the b-value: \n");
		double bVal = inKey.nextDouble();
		System.out.print("What is the c-value: \n");
		double cVal = inKey.nextDouble();
		
		System.out.println("\n");
		
		System.out.println("x1 = " + (((-bVal + Math.sqrt(((bVal*bVal))-((4*aVal*cVal))))/(2*aVal))) + ".");
		System.out.println("x2 = " + (((-bVal - Math.sqrt(((bVal*bVal))-((4*aVal*cVal))))/(2*aVal))) + ". \n");
		
	}



}
