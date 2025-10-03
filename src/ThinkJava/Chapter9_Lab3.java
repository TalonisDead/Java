package ThinkJava;                             // package (thư mục/namespace) chứa lớp này

import java.awt.Point;                        // import lớp Point (x, y)
import java.awt.Rectangle;                    // import lớp Rectangle (x, y, width, height)

public class Chapter9_Lab3 {                  // khai báo lớp

  // In một Point theo định dạng "(x, y)"
  public static void printPoint(Point p) {    // p là tham chiếu tới một object Point
    System.out.println("(" + p.x + ", " + p.y + ")");  // in ra toạ độ p.x và p.y
  }

  // Tính tâm (center) của một Rectangle và trả về như một Point mới
  public static Point findCenter(Rectangle box) { 
    int x = box.x + box.width / 2;            // toạ độ x của tâm = left + width/2  (chia nguyên)
    int y = box.y + box.height / 2;           // toạ độ y của tâm = top  + height/2 (chia nguyên)
    return new Point(x, y);                   // tạo và trả về Point mới với toạ độ vừa tính
  }

  // Điểm bắt đầu chương trình
  public static void main(String[] args) {
    Rectangle box1 = new Rectangle(2, 4, 7, 9); // tạo Rectangle với x=2, y=4, width=7, height=9

    // Tìm tâm của box1 (lúc này box1.width=7, box1.height=9)
    // width/2 = 7/2 = 3 (chia nguyên), height/2 = 9/2 = 4
    // => center = (2+3, 4+4) = (5, 8)
    Point p1 = findCenter(box1);               // p1 trỏ tới một Point mới có toạ độ (5,8)

    printPoint(p1);                            // in p1 => "(5, 8)"

    // Thay đổi kích thước box1: grow(1,1) mở rộng theo cả 2 chiều
    // Cách hoạt động của grow(dx,dy): box.x -= dx; box.y -= dy;
    //                             box.width += 2*dx; box.height += 2*dy;
    // Với dx=1, dy=1: x = 2-1 = 1; y = 4-1 = 3; width = 7+2 = 9; height = 9+2 = 11
    box1.grow(1, 1);                            // mutate trực tiếp object box1 trên heap

    // Tìm tâm của box1 sau khi grow:
    // width/2 = 9/2 = 4; height/2 = 11/2 = 5
    // => center = (1+4, 3+5) = (5, 8)
    Point p2 = findCenter(box1);               // p2 trỏ tới một Point mới khác, cũng có toạ độ (5,8)

    printPoint(p2);                            // in p2 => "(5, 8)"
  } // kết thúc main
} // kết thúc lớp
//Ghi chú tóm tắt hữu ích để ôn:
//
//findCenter luôn tạo new Point(...) → mỗi lần gọi là một object khác.
//
//Rectangle.grow(dx,dy) thay đổi chính Rectangle đó (không trả về object mới).
//
//== so sánh tham chiếu (alias), equals(...) thường so sánh giá trị/đặc tính (ở Point bằng toạ độ).
//
//Khi tính box.width / 2 với width là int, Java làm chia nguyên, không làm tròn kiểu thực số.
