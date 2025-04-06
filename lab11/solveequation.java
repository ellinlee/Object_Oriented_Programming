/**
 * Returns the larger of the two roots of the quadratic equation
 * A*x*x + B*x + C = 0, provided it has any roots. If A == 0 or
 * if the discriminant, B*B - 4*A*C, is negative, then an
 exception
 * of type IllegalArgumentException is thrown.
 */

package lab10;
import java.util.Scanner;

public class solveequation {
    public static void main(String[] arg){
        double A, B,C;
        double solution;
        String continueq;

        Scanner sc = new Scanner(System.in);

        do {
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            try {
                solution = root(A, B, C);
                System.out.println("Answer : " + solution);
            }
            catch(IllegalArgumentException e) {
                System.out.println("ERROR MESSAGE");
            }
            System.out.println("Continue? yes or no");
            continueq = sc.next();
        }while(!(continueq.equals("no")));

    }

    static public double root( double A, double B, double C )
            throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        }
        else {
            double disc = B*B - 4*A*C;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminant < zero.");
            return (-B + Math.sqrt(disc)) / (2*A);
        }
    }
}
