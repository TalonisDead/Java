package Lab3;

import java.util.Scanner;

public class Lab03Bai02 {
	public static void main(String[] args) {
//		Viết bảng cửu chương của 1 số nguyên bất kỳ 
		System.out.println("Lab3 bai 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập một số nguyên bất kỳ: ");
		int number = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", number, i, number * i);
		}

		scanner.close();
	}
}
