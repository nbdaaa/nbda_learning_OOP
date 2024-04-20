
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex4_ArraySort_by_comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[10]; // Khai bao 1 mang 10 ptu
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        } 
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            
        });  
        for (int x : a){
            System.out.printf(x + " ");
        }
    }
}
