package Lab2;

import java.util.Scanner;

public class Lab02Bai01 {
//	 Cho phương trình ax + b = 0 
//	 Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình trên
	public static void main(String[] args) {
		System.out.println("Lab 02 Bài 01");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b = ");
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.println("x = " + x);
		}

		scanner.close();
	}
}
