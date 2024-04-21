/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.SellingProfitClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Good> list = new ArrayList<>();
        
        for (int i = 0; i < m; i++){
            sc.nextLine();
            Good thing = new Good(i, sc.nextLine(), sc.nextInt(), sc.nextInt());
            list.add(thing);
        }
        
        list.sort(new Comparator<Good>(){
            @Override
            public int compare(Good o1, Good o2) {
                if (o1.profit() == o2.profit()){
                    return o1.getId().compareTo(o2.getId());
                }
                else{
                    return o2.profit() - o1.profit();
                }
            }
            
        });
        
        for (Good x: list){
            System.out.println(x);
        }
    }
}
