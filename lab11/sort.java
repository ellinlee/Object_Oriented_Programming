package lab10;
import java.util.Scanner;

public class sort {
    static int[] array = new int[100];
    static int num = 0;

    public static void sort(int[] array) {
        for(int i=num-1; i<=num-1; i++) {
            int j = i - 1;
            int temp = array[i];

            while(j>=0 && temp<array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            array[num] = sc.nextInt();

            if(array[num]==0 || array[num] < 0) {
                break;
            }
            num++;
            sort(array);
            for(int i=0; i< num; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
