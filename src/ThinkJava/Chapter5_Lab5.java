package ThinkJava;

import java.util.Scanner;

public class Chapter5_Lab5 {
	// Hàm tính lũy thừa (base^exp)
	public static int raiseToPow(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		return result;
	}

	public static void check_fermat(int a, int b, int c, int n) {
		if (n > 2 && (raiseToPow(a, n) + raiseToPow(b, n) == raiseToPow(c, n))) {
			System.out.println("“Trời, Fermat đã lầm!”");
		} else {
			System.out.println("“Không, vẫn không đúng”");
		}
	}

	public static void main(String[] args) {
//		raiseToPow(2,3);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println("Kết quả luỹ thừa a^n: " + raiseToPow(a, n));
		check_fermat(a, b, c, n);

		scanner.close();
	}
}
