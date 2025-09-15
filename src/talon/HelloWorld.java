package talon;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int a = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap ten: ");
		String b = scan.nextLine();
		System.out.println("Nhap so: ");
		int c = scan.nextInt();

		System.out.println("ten la: " + b + (" ,tuoi la :" + (a + c)));
	}
}
