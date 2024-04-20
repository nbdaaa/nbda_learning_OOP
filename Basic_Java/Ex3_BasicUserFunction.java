
import java.util.Scanner;

public class Ex3_BasicUserFunction {
    public static int gcd(int a, int b){
        while (b != 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    
    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt();
        System.out.printf("%d %d", gcd(a,b), lcm(a,b));
    }
}
