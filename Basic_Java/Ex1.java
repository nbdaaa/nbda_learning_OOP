import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 10000023912031L;
        System.out.println(a);
              
        float b = sc.nextFloat();
        System.out.println(b);
        
        char kiTu;
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.isEmpty()) {
                kiTu = line.charAt(0);
                System.out.println(kiTu);
                break;
            }
        } 
    }
}
