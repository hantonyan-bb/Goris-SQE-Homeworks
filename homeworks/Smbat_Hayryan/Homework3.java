/*
 ax^2+bx+c
*/
   
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hat hat kiri tvern u enter yra ");
		double a = input.nextDouble();
		if (a == 0) {

			System.out.println("a-n 0 karal chi ini, verjum error a talu!");
   		}
		double b = input.nextDouble();
		double c = input.nextDouble();

	
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		System.out.print("Havasarumn uni ");
		if (discriminant > 0.0) {

			double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
			System.out.println("erku hat lucum: " + x1 + " yev " + x2);
		}
		else if (discriminant == 0.0) {
			double x1 = (-b) / (2 * a);
			System.out.println("mi hat lucum: " + x1);
		}
		else
			System.out.println("voch mi hat lucum");
	}
}
