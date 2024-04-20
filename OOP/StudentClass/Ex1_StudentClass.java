
package OOP.StudentClass;

import java.util.ArrayList;
import java.util.Scanner;

/*
Bài toán: Nhập vào từ bàn phím số n là danh sách số lượng sinh viên
Mỗi dòng nhập vào: Tên, Ngày tháng năm sinh, điểm 3 môn
--> Output: Tên, Ngày tháng năm sinh, cpa (đã chia trung bình ra)
*/

public class Ex1_StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            float gpa1 = sc.nextFloat();
            float gpa2 = sc.nextFloat();
            float gpa3 = sc.nextFloat();
            sc.nextLine();
            Student st = new Student(name, dob, gpa1, gpa2, gpa3);
            list.add(st);
        }
        
        for (Student s : list){
            s.info(); 
        }
    }
}