package LAB11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String arg[]) {
        List<String> A = new java.util.ArrayList<String>();
        List<String> B = new java.util.ArrayList<String>();

        A.add("Hello");
        A.add("hi");
        A.add("Good");
        B.add("Hi");
        B.add("Bad");
        B.add("Good");

        System.out.print("[");
        for (String a : A) {
            boolean isEquals = false;
            for (String b : B) {
                isEquals = a.contains(b);
                if (isEquals) {
                    System.out.print("Yes ");
                    break;
                }
            }
            if (!isEquals)
                System.out.print("No ");
        }
        System.out.print("]");
        System.out.println(" ");


        Iterator<String> aIterator = A.iterator();
        Iterator<String> bIterator = B.iterator();

        while (aIterator.hasNext()) {
            System.out.print(aIterator.next() + " ");
        }
        System.out.println(" ");
        while (bIterator.hasNext()) {
            System.out.print(bIterator.next() + " ");
        }
    }
}
