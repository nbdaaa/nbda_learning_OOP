
package OOP.StudentClass2;

import java.util.StringTokenizer;


public class Student {
    private String id;
    private String name;
    private String date;
    private String className;
    private double gpa;
    private static int count;
    
    Student(){
        count++;
        if (count < 10){
            this.id = "00" + count;
        }
        else{
            this.id = "" + count;
        }
        this.name = "";
        this.date = "";
        this.className = "";
        this.gpa = 0;
    }

    public Student(String name, String date, String className, double gpa) {
        count++;
        if (count < 10){
            this.id = "00" + count;
        }
        else{
            this.id = "" + count;
        }        
        this.name = name;
        this.date = date;
        this.className = className;
        this.gpa = gpa;
    }

    
    
    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public String getClassName() {
        return this.className;
    }

    public double getGpa() {
        return this.gpa;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id = " + id + ", name = " + name + ", date = " + date + ", className = " + className + ", gpa = " + gpa + '}';
    }
    
    public void standardName(){
        StringBuilder sb = new StringBuilder("");
        String[] s = this.name.split("\\s+");
        
        for (String x: s){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        
        this.name = sb.toString();
    }
    
    public void  standardDate(){
        StringBuilder sb = new StringBuilder(this.date);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        this.date = sb.toString();
    }
    
    

    
    
    
}
