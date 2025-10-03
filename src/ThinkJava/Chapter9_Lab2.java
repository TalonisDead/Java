package ThinkJava;  

import java.awt.Point;       // Import lớp Point (điểm với tọa độ x, y)
import java.awt.Rectangle;   // Import lớp Rectangle (hình chữ nhật với tọa độ và kích thước)

public class Chapter9_Lab2 {
	
    // Hàm tính khoảng cách Euclid giữa 2 điểm p1 và p2
	public static double distance(Point p1, Point p2) {
		int dx = p1.x - p2.x;                    // Hiệu theo trục x
		int dy = p1.y - p2.y;                    // Hiệu theo trục y
		return Math.sqrt(dx * dx + dy * dy);     // sqrt(dx² + dy²) -> khoảng cách
	}

    // Hàm tìm tọa độ tâm của một hình chữ nhật
	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;    // Tọa độ tâm theo trục x
		int y = box.y + box.height / 2;   // Tọa độ tâm theo trục y
		return new Point(x, y);           // Trả về đối tượng Point tại (x, y)
	}

	public static void main(String[] args) {
		Point blank = new Point(5, 8);              // Tạo điểm blank có tọa độ (5, 8)
		Rectangle rect = new Rectangle(0, 2, 4, 4); // Tạo hình chữ nhật có góc trái trên (0,2), rộng 4, cao 4

		Point center = findCenter(rect);            // Tìm tâm của hình chữ nhật (0,2,4,4) → tâm là (2,4)
		double dist = distance(center, blank);      // Tính khoảng cách từ center (2,4) đến blank (5,8)

		System.out.println(dist);                   // In khoảng cách ra màn hình
	}
}
// Giải thích nhanh:
// Tâm của Rectangle(0,2,4,4) là (0 + 4/2, 2 + 4/2) = (2,4).
// Điểm blank = (5,8)
// Khoảng cách giữa (2,4) và (5,8) = √((5-2)² + (8-4)²) = √(9 + 16) = √25 = 5.0.