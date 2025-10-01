package ThinkJava;

import java.util.Scanner;

public class Chapter3_Lab5 {
	// Dùng chung 1 Scanner toàn cục
	static Scanner scanner = new Scanner(System.in);

	public static void printAmerican(String d, String m, int dt, int y) {
		System.out.println("American format: " + d + ", " + m + " " + dt + ", " + y);
	}

	public static void printEuropean(String d, String m, int dt, int y) {
		System.out.println("European format: " + d + " " + dt + " " + m + ", " + y);
	}

	public static void main(String[] args) {
		// Nhập dữ liệu 1 lần duy nhất
		System.out.print("Nhập thứ trong tuần: ");
		String d = scanner.nextLine();

		System.out.print("Nhập tháng trong năm: ");
		String m = scanner.nextLine();

		System.out.print("Nhập ngày trong tháng: ");
		int dt = scanner.nextInt();

		System.out.print("Nhập năm: ");
		int y = scanner.nextInt();

		// Dùng chung dữ liệu cho cả hai hàm
		printAmerican(d, m, dt, y);
		printEuropean(d, m, dt, y);

		scanner.close();
	}
}
