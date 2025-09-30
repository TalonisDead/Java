package ThinkJava;

import java.util.Scanner;

public class Chapter2_Lab2 {
	public static void main(String[] args) {
		System.out.print("Nhập ngày trong tuần, tháng, ngày trong tháng, năm: ");
		Scanner scanner = new Scanner(System.in);

		String day = scanner.nextLine();
		String month = scanner.nextLine();
		int date = scanner.nextInt();
		int year = scanner.nextInt();

		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
		System.out.println("European format: " + day + " " + date + " " + month + ", " + year);

		scanner.close();
	}
}
