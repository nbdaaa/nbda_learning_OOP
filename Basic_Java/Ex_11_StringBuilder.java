
import java.util.Scanner;

public class Ex_11_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        /*
        StringBuilder là lớp dùng để thao tác lên các chuỗi xâu String (Lưu ý với String thông thường sẽ không thể tác động lên chuỗi khi đã nhập vào)
        Một vài phương thức thường dùng:
        sb.append(), sb.delete(), sb.deleteCharAt(), sb.reverse(), sb.charAt(), sb.replace(), sb.toString()
        */
        
        
        //Ví dụ về bài toán chuẩn hóa tên
        StringBuilder sb = new StringBuilder("");

        String[] arr = s.split("\\s+");
        for (String x: arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
        
        
        // Nghịch 1 chút, đảo lại từng từ 1 trong tên vừa chuẩn hóa và viết lại theo đúng thứ tự các từ trong xâu
        StringBuilder Sb = new StringBuilder("");
        
        String[] sArr = sb.toString().split("\\s+");
        
        for (String x: sArr){
            StringBuilder tmp = new StringBuilder(x);
            tmp.reverse();
            Sb.append(tmp + " ");
        }
        
        System.out.println(Sb.toString());
        
        
    }
}
