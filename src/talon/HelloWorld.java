package talon;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap so: ");
		int age1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap ten: ");
		String name = scan.nextLine();
		System.out.println("Nhap so: ");
		int age2 = scan.nextInt();

		System.out.println("ten la: " + name + (" ,tuoi la :" + (age1 + age2)));
		scan.close();
	}
}
