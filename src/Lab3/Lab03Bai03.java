package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03Bai03 {
	public static void main(String[] args) {
		System.out.println("Lab03 Bai02");
		System.out.println("Nhập và số phần tử của mảng: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int min;
		int max;
		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
		min = arr[0];
		max = arr[n - 1];
		System.out.println("Số nhỏ nhất trong mảng là: " + min);
		System.out.println("Số nhỏ nhất trong mảng là: " + max);

		scanner.close();
	}
}
