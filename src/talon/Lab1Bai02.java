package talon;

import java.util.Scanner;

public class Lab1Bai02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tim chu vi, diện tích, cạnh nhỏ nhất của hình chữ nhật.");
		System.out.println("Chiều dài hình chữ nhật: ");
		int length = scan.nextInt();
		System.out.println("Chiều rộng hình chữ nhật: ");
		int width = scan.nextInt();

		int perimeter = (length + width) * 2;
		int area = length * width;
		int minSide = Math.min(length, width);

		System.out.println("Chu vi = " + perimeter);
		System.out.println("Diện tích = " + area);
		System.out.println("Cạnh nhỏ nhất = " + minSide);

		scan.close();
	}
}
