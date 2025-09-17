package talon;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 23, 11, 45, 41 };

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
