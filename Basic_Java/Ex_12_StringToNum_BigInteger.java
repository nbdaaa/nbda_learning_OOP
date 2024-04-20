
import java.math.BigInteger;
import java.util.Scanner;


public class Ex_12_StringToNum_BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1231324134;
        String s = "" + n; // Thao tác chuyển số n thành xâu 
        System.out.println(s);
        
        Long m = Long.parseLong(s); // Thao tác chuyển xâu s thành số m (Theo kiểu dữ liệu Long)
        Integer i = Integer.parseInt(s); // Thao tác chuyển xâu s thành số n (Theo kiểu dữ liệu Integer)
        System.out.println(m);
        System.out.println(i);
        
        
        // Lớp BigInteger: Dùng để lưu trữ vào thao tác với những số nguyên lớn, vượt ngoài phạm vi mà các kiểu dữ liệu thông thường cho phép
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.divide(b));
        System.out.println(a.multiply(b));
        // System.out.println(a.pow(b)); Cái này to lắm :)) Không khuyến khích chạy
        System.out.println(a.gcd(b));
        System.out.println(a.max(b));
        System.out.println(a.min(b));
        
        
    }
}
