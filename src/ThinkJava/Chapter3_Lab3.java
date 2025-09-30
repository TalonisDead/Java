package ThinkJava;

import java.util.Scanner;

public class Chapter3_Lab3 {
// Mục đích của bài tập này là đảm bảo hiểu được cách viết 
//	và cách kích hoạt phương thức nhận tham số.

	public static void zool() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số bạn thích: ");
		int number = scanner.nextInt();
		scanner.nextLine(); // bỏ ký tự Enter

		System.out.print("Nhập thú cưng của bạn: ");
		String pet = scanner.nextLine();

		System.out.print("Nhập tên đường nhà bạn: ");
		String nameStreet = scanner.nextLine();

		System.out.println("Kết quả: " + number + " " + pet + " " + nameStreet);

		scanner.close();
	} // Cách A: Nhập trong zool (gọn hơn)

	public static void zool(int number, String pet, String nameStreet) {

		System.out.println("Kết quả: " + number + " " + pet + " " + nameStreet);

	} // Cách B: Truyền tham số vào zool

	public static void main(String[] args) {
//		Cách B:
//		System.out.println("Nhập vào số bạn thích: ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Nhập thú cưng của bạn: ");
//		String pet = scanner.nextLine();
//		System.out.println("Nhập tên đường nhà bạn: ");
//		String nameStreet = scanner.nextLine();
//		zool(number, pet, nameStreet);

//		scanner.close();
		zool(); // Cách A
	}
}
