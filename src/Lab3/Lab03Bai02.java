package Lab3;

import java.util.Scanner;

public class Lab03Bai02 {
	public static void main(String[] args) {
//		Viết bảng cửu chương của 1 số nguyên bất kỳ 
		System.out.println("Lab03 Bai 2");
		System.out.println("Nhập một số nguyên bất kỳ: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.printf("%d x %d = %d \n", number, i, number * i);
		}

		scanner.close();
	}
}
