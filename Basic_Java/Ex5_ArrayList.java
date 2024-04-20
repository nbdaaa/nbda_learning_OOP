
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

        
public class Ex5_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        //ArrayList: add(...), get(int i), toArray, remove(index), remove(Object) (nhớ ép kiểu về Object), 
        for (int i=0; i < n; i++){
            arr.add(sc.nextInt());
        }
        
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");

        Object[] tmp = arr.toArray();
        
        for (Object x : tmp){
            System.out.print(x + " ");
        }
        
        System.out.println("");
        
        arr.remove(1); //remove index
        arr.remove( (Object) 1 ); //remove Object (luu y ep kieu ve Object)
        
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        
        System.out.println("");
        
        System.out.println("Let's start from the beginning!");
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for (Object x : tmp){
            a.add( (int) x );
        }
        
        for (int x : a){
            System.out.print(x + " ");
        }
        
        System.out.println("");
        
        System.out.println("Okay let's go");
        
        a.forEach((x) -> System.out.print(x + " "));
        
        System.out.println("");
        
        a.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        
        a.forEach((x) -> System.out.print(x + " "));
    }
}
