package talon;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
//		- dưới 10M: không đóng thuế 
//		- từ 10M tới 15M: thuế 10% 
//		- từ 15 tới 30M : thuế 20% 
//		- trên 30M: thuế 50% 
		System.out.println("Nhập số tiền: ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();

		if (money < 10) {
			System.out.println("Không đóng thuế");
		} else if (money >= 10 && money <= 15) {
			System.out.println("Thuế 10%");
		} else if (money > 15 && money <= 30) {
			System.out.println("Thuế 20%");
		} else if (money > 30) {
			System.out.println("Thuế 50%");
		}

		scan.close();
	}
}
