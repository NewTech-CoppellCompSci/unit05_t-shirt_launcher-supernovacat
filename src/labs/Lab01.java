package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int exponent = inKey.nextInt();
		
		System.out.println(number + "^" + exponent + " = " + Math.pow(number, exponent) + "\n" );
		
		
		
	}
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = inKey.nextInt();
		
		System.out.println(" The square root of " + number + " is " + Math.sqrt(number) + "\n" );
		
		
				
	}
	
	
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Length of side A: ");
		int sideA = inKey.nextInt();
		System.out.print("Length of side B: ");
		int sideB = inKey.nextInt();
		
		
		System.out.println("Hypotenuse = " + Math.hypot(sideA, sideB));
		
		System.out.println("\n");
		
	}
	
	
	
	public static void problem4() {
	
		Scanner inKey = new Scanner(System.in);
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int input = 1;
		
		while (input != 0) {
			System.out.println("Enter an integer: ");
			input = inKey.nextInt();
			
			max = Math.max(max, input);
			min = Math.max(min, input);
			if (input == 0) {
				break;
				
			}
			
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
			
			
		}
	
	
		}
	
		}
