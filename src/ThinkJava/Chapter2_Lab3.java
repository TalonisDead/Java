package ThinkJava;

import java.util.Scanner;

public class Chapter2_Lab3 {
	public static void main(String[] args) {
		System.out.println("Nhập giờ, phút, giây: ");
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int second = scanner.nextInt();

		// Tính số giây kể từ nửa đêm
		int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
		System.out.println("Số giây kể từ nửa đêm: " + secondsSinceMidnight);

		// Tính số giây còn lại đến hết ngày
		int secondsInDay = 24 * 3600;
		int secondsRemaining = secondsInDay - secondsSinceMidnight;
		System.out.println("Số giây còn lại trong ngày: " + secondsRemaining);
		// Tính phần trăm thời gian đã trôi qua trong ngày
		double percentPassed = (secondsSinceMidnight * 100.0) / secondsInDay;
		System.out.println("Phần trăm thời gian đã trôi qua: " + percentPassed + "%");

		scanner.close();
	}
}
