package talon;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("First Number: ");
		int FirstNumber = scan.nextInt();
		System.out.println("Second Number: ");
		int SecondNumber = scan.nextInt();
		System.out.println("Three Number: ");
		int ThreeNumber = scan.nextInt();

		int max = Math.max(FirstNumber, Math.max(SecondNumber, ThreeNumber));
		System.out.println("Max = " + max);
		int min = Math.min(FirstNumber, Math.min(SecondNumber, ThreeNumber));
		System.out.println("Min = " + min);

		scan.close();
	}
}
