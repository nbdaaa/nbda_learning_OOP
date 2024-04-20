
package OOP.StudentClass;

public class Student {
    private String name;
    private String dob;
    private float gpa1;
    private float gpa2;
    private float gpa3;
    private float cpa;
    
    Student(String ten, String ngaysinh, float diem1, float diem2, float diem3){
        name = ten;
        dob = ngaysinh;
        gpa1 = diem1;
        gpa2 = diem2;
        gpa3 = diem3;
        cpa = (gpa1 + gpa2 + gpa3)/3;
    }
    
    public void info(){
        System.out.println(name + " " + dob + " " + cpa);
    }
}
