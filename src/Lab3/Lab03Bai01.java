package Lab3;

import java.util.Scanner;

public class Lab03Bai01 {
	public static void main(String[] args) {
//		Tìm số nguyên số
		System.out.println("Lab3 bai 1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập một số nguyên bất kỳ: ");
		int number = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				System.out.println("Ước số khác: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d là số nguyên tố", number);
		} else {
			System.out.printf("%d không là số nguyên tố", number);
		}

		scanner.close();
	}
}
