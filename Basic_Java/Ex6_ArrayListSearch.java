
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Ex6_ArrayListSearch {
    public static boolean linSearch(ArrayList<Integer> a, int n, int target){
        for (int i = 0; i < n; i++){
            if (a.get(i) ==
                    target){
                return true;
            }
        }
        return false;
    }
    
    public static boolean binSearch(ArrayList<Integer> a, int n, int target){
        int l = 0, r = n-1;
        
        while (l <= r){
            int m = (l+r)/2;
            
            if (a.get(m) == target){
                return true;
            }
            else if (a.get(m) < target){  
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return false;
    }
    
    // trong Arrays. có Arrays.binarySearch
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        
        arr.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
             
        int target = sc.nextInt();
        
        System.out.println(binSearch(arr, n, target));
    }
}
