package ¿Ã¿∫√§_202021711_assignment1;
import java.util.*;

public class lab1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		
		int d= calculateAverage(a,b,c);
		System.out.println(d);
		
	}
	
	public static int calculateAverage(int num1, int num2, int num3) {
		return (num1 +num2 +num3)/3;
	}

}
