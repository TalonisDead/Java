package Lab1;

import java.util.Scanner;

public class Lab1Bai03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tính thể tích của khối lập phương.");
		System.out.println("Cạnh của khối lập phương là: ");
		int edge = scan.nextInt();
		double volume = Math.pow(edge, 3);

		System.out.println("Thể tích = " + volume);
		scan.close();
	}
}
