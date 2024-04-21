
package OOP.BookandAuthorClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Book> list = new ArrayList<>();      
        
        for (int i = 0; i < n; i++){
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();
            Author author = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
            Book book = new Book(name, price, qty, author);
            list.add(book);
        }
        
        list.sort(new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() != o2.getPrice()){
                    return (int) (o2.getPrice()-o1.getPrice());
                }
                else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        
        for (Book x: list){
            System.out.println(x);
        }
        
        
    }
}
