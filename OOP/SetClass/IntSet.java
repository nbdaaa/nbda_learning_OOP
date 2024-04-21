
package OOP.SetClass;

import java.util.TreeSet;


class IntSet {
     private TreeSet<Integer> set;
     
     public IntSet(){
         set = new TreeSet<>();
     }
     
     public IntSet(int[] a){
         set = new TreeSet<>();
         for (int i = 0; i < a.length; i++){
             this.set.add(a[i]);
         }
     }
     
     public IntSet intersection(IntSet b){
         IntSet intersec = new IntSet();
         for (int x: this.set){
             if (b.set.contains(x)){
                 intersec.set.add(x);
             }
         }
         return intersec;
     }

    @Override
    public String toString() {
        String res = "";
        for (int x: this.set){
            res = res + x + " "; 
        }
        return res;
    }
     
     
}
