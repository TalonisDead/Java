package Lab2;

import java.util.Scanner;

public class Lab02Bai02 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.println("x = " + x);
		}
	}

	public static void giaiPhuongTrinhBacHai(int a, int b, int c) {
		System.out.printf("Giải phương trình bậc 2 %dx^2 + %dx + %d = 0 \n", a, b, c);
		float delta = (float) (Math.pow(b, 2) - 4 * a * c);

		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			float x = (float) (-b / (2.0 * a));
			System.out.println("Phương trình có nghiệm kép x = " + x);
		} else {
			float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm phân biệt:");
			System.out.println("x1 = " + x1 + " ; x2 = " + x2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Lab 02 Bài 02");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập số nguyên c: ");
		int c = scanner.nextInt();

		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			giaiPhuongTrinhBacHai(a, b, c);
		}

		scanner.close();
	}
}
