package Lab1;

import java.util.Scanner;

public class Lab1Bai01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhập tên sinh viên: ");
		String name = scan.nextLine();
		System.out.println("Nhập tuổi sinh viên: ");
		int age = scan.nextInt();

		System.out.println("Tên của sinh viên là: " + name + ", Tuổi của sinh viên là: " + age);

		scan.close();
	}
}
