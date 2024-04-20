
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Ex_10_StringSplit {
    public static void main(String[] args) {
        String s = "Nguyen Bui Duc Anh Chuyen Toan Chuyen Tran Phu Dang Hoc Tai Hust";
 
        String[] arr = s.split("\\s+"); 
        /* Hàm s.split("String") sẽ tách xâu ngăn cách bởi các String được nhập vào, vậy nên hoàn toàn có thể dùng s.split(" ") để tách ra bởi các dấu cách
        Tuy nhiên lưu ý, nếu xâu s chữa nhiều hơn 1 dấu cách ngăn cách các từ thì không dùng được s.split(" ")    
        --> Dùng s.split("\\s+") sẽ tách hết dấu cách ra, an toàn hơn!
        */
        for (String str: arr){
            System.out.println(str);
        }
        System.out.println("");
        
        //Cách 2: Sử dụng lớp StringTokenizer
        
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println("");
        
        //Lưu các tokens vừa tách vào trong ArrayList
        ArrayList<String> arrList = new ArrayList<>();
        while(st.hasMoreTokens()){
            arrList.add(st.nextToken());
        }
        for (String x : arrList){
            System.out.println(x);
        }
        System.out.println("");
        

        String s_ = "Nguyen `@!Bui    !@Duc Anh ?/&Chuyen **Toan #$Chuyen Tran Phu @Dang !@Hoc @!Tai &^%$Hust";
        /* Demo về cách tách 1 xâu ngăn bởi ký tự linh tinh: `, @, !, ?, &, ^, %, *, $, #
        --> Ý tưởng: Sử dùng hàm s.replace(char target, char replacement) đổi cách ký tự đặc biệt thành " "
        --> Sau đó sử dùng s.split("\\s+") để tách hết dấu " "
        */
        s_ = s_.replace('`', ' '); 
        s_ = s_.replace('@', ' ');
        s_ = s_.replace('!', ' ');
        s_ = s_.replace('?', ' ');
        s_ = s_.replace('/', ' ');
        s_ = s_.replace('&', ' '); 
        s_ = s_.replace('^', ' ');
        s_ = s_.replace('%', ' '); 
        s_ = s_.replace('*', ' '); 
        s_ = s_.replace('$', ' '); 
        s_ = s_.replace('#', ' ');
        String[] array = s_.split("\\s+"); 
        for (String str: array){
            System.out.println(str);
        }
        System.out.println("");
        
    }
}
