package Lab2;

import java.util.Scanner;

public class Lab02Bai04 {

	public static void bai1() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b = ");
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.println("x = " + x);
		}

		scanner.close();
	}

	public static void bai2() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập số nguyên c: ");
		int c = scanner.nextInt();
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

		scanner.close();
	}

	public static void bai3() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số điện: ");
		int soDien = scanner.nextInt();
		int money;
		System.out.print("Nhập vào số điện: ");

		if (soDien > 0 && soDien < 100) {
			money = soDien * 1000;
			System.out.println("Số tiền điện là: " + money);
		} else {
			money = 100 * 1000 + (soDien - 100) * 1500;
			System.out.println("Số tiền điện là: " + money);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất             ");
		System.out.println("| 2. Giải phương trình bậc hai             ");
		System.out.println("| 3. Tính số tiền điện            ");
		System.out.println("| 4. Kết thúc              ");
		System.out.println("++ ------------------ ++");
		System.out.print("Lựa chọn tính năng: ");
		int choose = scanner.nextInt();

		switch (choose) {
		case 1:
			bai1();
			break;
		case 2:
			bai2();
			break;
		case 3:
			break;
		default:
			System.out.println("Bạn đã thoát chương trình");
			System.exit(0);
		}

		scanner.close();
	}
}
