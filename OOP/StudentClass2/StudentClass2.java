
package OOP.StudentClass2;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            sc.nextLine(); // Tránh trôi lệnh
            Student sv = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sv.standardName();
            sv.standardDate();
            list.add(sv);
        }
        
        for (Student x: list){
            System.out.println(x);
        }
        
    }
}
