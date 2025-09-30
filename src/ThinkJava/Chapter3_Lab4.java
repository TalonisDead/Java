package ThinkJava;

import java.util.Scanner;

public class Chapter3_Lab4 {
	// Dùng chung 1 Scanner toàn cục
	static Scanner scanner = new Scanner(System.in);

	// --- Các hàm con ---
	public static String day() {
		System.out.println("Nhập thứ trong tuần");
		return scanner.nextLine();
	}

	public static String month() {
		System.out.println("Nhập tháng trong năm: ");
		return scanner.nextLine();
	}

	public static int date() {
		System.out.println("Nhập ngày trong tháng: ");
		return scanner.nextInt();
	}

	public static int year() {
		System.out.println("Nhập năm: ");
		return scanner.nextInt();
	}

	public static void printAmerican() {
		String d = day();
		String m = month();
		int dt = date();
		int y = year();
		System.out.println("printAmerican: " + d + " " + m + " " + dt + ", " + y);
	}

	public static void printEuropean() {
		String d = day();
		String m = month();
		int dt = date();
		int y = year();
		System.out.println("printEuropean: " + d + " " + dt + " " + m + ", " + y);
	}

	public static void main(String[] args) {
		printAmerican();
		printEuropean();
		scanner.close();
	}
}
