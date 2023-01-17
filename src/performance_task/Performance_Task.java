package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter launch velocity (m/s) : ");
		double velopcity = inKey.nextDouble();
		System.out.println("Enter launch angle (degrees) : ");
		double anglee = inKey.nextDouble();
		
		System.out.println("\n");
		System.out.println("Projectile's path");
		System.out.println("\n");
		
		int time = 0;
		double x = 0;
		double y = 0;
		
		do {
			System.out.println("Time: " + time + "s");
			
			x = Math.cos(Math.toRadians(anglee)) * time * velopcity;
			y = Math.sin(Math.toRadians(anglee)) * time * velopcity - (0.5 * 9.8 * Math.pow(time, 2));
			
			if (y < 0) {
				break;
			}
			
			System.out.println("\tx-pos: " + x + "m");
			System.out.println("\ty-pos: " + y + "m");
			
			time++;
			
			
		} while (y >= 0);
		
		
		System.out.println("\tx-pos: " + x + "m");
		System.out.println("\ty-pos: 0m");
		
	}
	
}
