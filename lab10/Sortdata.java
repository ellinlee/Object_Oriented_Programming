package LAB11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortdata {
    public static void main(String arg[]){
        ArrayList<Author> auth = new ArrayList<Author>();

        auth.add(new Author("amy", "cd", 40));
        auth.add(new Author("john", "ef", 70));
        auth.add(new Author("mike", "ab", 55));

        System.out.println("Choose the number(1 is name, 2 is bookname, and 3 is author age");
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        switch(number){
            case 1:
                System.out.println("Sorting arraylist auth by authorName");
                Collections.sort(auth);

                for (Author author : auth) {
                    System.out.println(author.getname() + "," + author.getbook() + "," + author.getAge());
                }
                break;
            case 2:
                System.out.println("Sorting arraylist auth by Book Name");
                Collections.sort(auth,new BookNameComparator());

                for(Author author: auth){
                    System.out.println(author.getname() + "," + author.getbook() + "," + author.getAge());
                }
                break;
            case 3:
                System.out.println("Sorting arraylist auth by Author Age");
                Collections.sort(auth,new AuthorAgeComparator());

                for(Author author: auth){
                    System.out.println(author.getname() + "," + author.getbook() + "," + author.getAge());
                }
                break;
        }

    }
}
