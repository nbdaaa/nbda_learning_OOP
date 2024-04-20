
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Ex8_HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        // HashMap<DataTypes, DataTypes> name = new HashMap<>();
        // put(key, value), containsKey(key), containsValue(value), get(key) --> value, remove(key)
        HashMap<Integer, Integer> map = new HashMap<>();
                
        
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (!map.containsKey(a[i])){
                map.put(a[i], 1);
            }
            else{
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        
        //Entry
        //Map.Entry ~ DataTypes represent the couple, map.entrySet -> Set các entry, entry.getKey(), entry.getValue()
        
        Set< Map.Entry<Integer, Integer> > entry = map.entrySet();
        for (Map.Entry<Integer, Integer> e : entry){
            System.out.println(e.getKey()+ " : "+ e.getValue());
        }
        
        /*
        Lưu Map.Entry trong ArrayList:
        
        ArrayList< Map.Entry<Integer, Integer> > entryArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            entryArr.add(entry);
        }
        
        for (int i = 0; i < n; i++){
            System.out.println( entryArr.get(i).getKey() + " " + entryArr.get(i).getValue );
        }     
        */
        
        
        // Ngoài ra còn có LinkedHashMap: Lưu các map.put vào theo thứ tự xuất hiện của key
        // TreeMap: Lưu các map.put vào theo thứ tự từ điển tăng dần của key
        // TreeMap: firstKey(), lastKey(), firstEntry(), lastEntry(), floorKey(), floorEntry(), ceilingKey(), ceilingEntry()
    }
}
