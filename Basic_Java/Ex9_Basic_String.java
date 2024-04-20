
import java.util.Scanner;


public class Ex9_Basic_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Sau khi nhập bộ nhớ đệm sẽ lưu ký tự xuống dòng và khiến dòng String s = sc.nextLine() bị trôi lệnh
        sc.nextLine(); // Lấy phím xuống dòng ra khỏi bộ nhớ đệm, giải phóng bộ nhớ đệm để tránh trôi lệnh phía dưới
        
        String s = sc.nextLine();
        System.out.println(s);
        
        System.out.println(s.length()); // In ra độ dài xâu
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i)); // In ra ký tự thứ i
        }
        
        System.out.println(s.toLowerCase()); // Chuyển hết về ký tự in thường
        System.out.println(s.toUpperCase()); // Chuyển hết về ký tự in hoa
        
        String a = "Nguyen Bui ";
        String b = "Duc Anh";
        String da = a + b; // Nối xâu bằng dấu '+', có thể hùng hàm String da = a.concat(b)
        
        System.out.println(a.compareTo(b)); // Hàm so sánh xâu, giống strcmp trong C, thường dùng để so sánh 2 xâu bằng nhau : a.compareTo(b) == 0 hoặc a.equals(b) -> True hoặc False
        System.out.println(a.compareToIgnoreCase(b)); // Hàm so sánh xâu, bỏ qua hết in hoa in thường khi so sánh
        
        System.out.println(a.substring(7)); // Hàm lấy xâu con, khá giống slicing trong Python a[7:]
        System.out.println(b.substring(5, 7)); // tương tự Python b[5:7]
        
        System.out.println(a.contains("Nguyen")); // Check có chứa xâu con không
        
        /* Ngoài ra còn có các hàm trong lớp Character kiểm tra loại ký tự như Character.isDigit(char c), Character.isLowerCase(char c), 
        Character.isUpperCase(char c), Character.isAlphabetic(char c), char toLowerCase(char c), char toUpperCase(char c)
        */
    }
}
