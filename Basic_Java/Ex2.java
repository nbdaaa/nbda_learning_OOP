
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
        } while (n < 0);
        System.out.println(n);

        outer : for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(i + " " + j);
                if (i == j && i == 3){
                    break outer;
                }
            }
        }
    }    
}
