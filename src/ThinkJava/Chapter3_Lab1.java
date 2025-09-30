package ThinkJava;

public class Chapter3_Lab1 {
	// Sử dụng hàm gọi

	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	}

	public static void main(String[] args) {
		int hour = 11;
		int minute = 59;
		printTime(hour, minute);
	}
}
