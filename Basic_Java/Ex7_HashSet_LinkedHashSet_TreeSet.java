
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Ex7_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        HashSet<Integer> hSet = new HashSet<>();
        HashSet<Integer> lhSet = new LinkedHashSet<>();
        TreeSet<Integer> tSet = new TreeSet<>();
        
        // HashSet, LinkedHashSet: add(int x), remove(int x), size(), contains(int x), clear(), isEmpty
        // TreeSet: floor(int x): ceiling(int x); first(), last(), lower(int x), higher(int x)
        
        for (int x : a){
            hSet.add(x);
            lhSet.add(x);
            tSet.add(x);
        }
        
        for (int x : hSet){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        for (int x : lhSet){
            System.out.print(x + " ");
        }
        System.out.println("");

        for (int x : tSet){
            System.out.print(x + " ");
        }
        System.out.println("");        
    }
}
