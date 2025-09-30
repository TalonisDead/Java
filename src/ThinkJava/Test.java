package ThinkJava;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static String day() {
		System.out.print("Nhập thứ trong tuần: ");
		return scanner.nextLine();
	}

	public static void printTwice(String s) { // in ra liên tiếp 2 giá trị của biến "s"
		System.out.println(s);
		System.out.println(s);
	}

	public static void main(String[] args) {

		String d = day();
		System.out.println("Bạn vừa nhập: " + d);

		System.out.println("Nhập giờ, phút, giây: ");
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int second = scanner.nextInt();
		scanner.nextLine(); // đọc bỏ ký tự Enter còn sót lại

		System.out.print("Nhập chuỗi String: ");
		String s = scanner.nextLine();
		printTwice(s);
		// tính toán rồi in ra số giây kể từ nửa đêm
		int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
		System.out.println("Số giây kể từ nửa đêm: " + secondsSinceMidnight);

		// tính toán rồi in ra số giây từ giờ đến hết ngày hôm nay
		int secondsInDay = 3600 * 24;
		int secondsLeftDay = secondsInDay - secondsSinceMidnight;
		System.out.println("Số giây từ giờ đến hết ngày hôm nay: " + secondsLeftDay);

		// toán rồi in ra số phần trăm thời gian đã trôi qua trong ngày hôm nay
		double percentPassed = secondsSinceMidnight * 100.0 / secondsInDay;
		System.out.println("Phần trăm thời gian đã trôi qua: " + percentPassed + "%");

		scanner.close();
	}
}
