package ThinkJava;

import java.awt.Point;

public class Chapter9_Lab1 {
	// Import lớp Point từ thư viện AWT

	public static void main(String[] args) {
		int x = 5; // Khai báo biến nguyên x = 5
		Point blank = new Point(1, 2); // Tạo đối tượng Point với tọa độ (1, 2)

		// Gọi hàm riddle(x, blank), tính kết quả và in ra màn hình
		System.out.println(riddle(x, blank)); // Kết quả: 15

		// In lại giá trị x trong hàm main
		System.out.println(x); // Vẫn là 5 (x nguyên thủy không bị thay đổi)

		// In ra tọa độ x của đối tượng Point blank
		System.out.println(blank.x); // Kết quả: 1 (không thay đổi)

		// In ra tọa độ y của đối tượng Point blank
		System.out.println(blank.y); // Kết quả: 2 (không thay đổi)
	}

	// Hàm riddle nhận vào một số nguyên x và một đối tượng Point p
	public static int riddle(int x, Point p) {
		x = x + 7; // Tăng x lên 7 (x trong hàm là bản sao, không ảnh hưởng main)
		return x + p.x + p.y; // Trả về tổng: x mới + tọa độ x + tọa độ y
	}
}
