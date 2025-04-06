package LAB6;

import java.util.Scanner;

public class testing {
    public static void main(String[] args){
        Patient mClinic[]=new Patient[100];

        Scanner sc=new Scanner(System.in);

        int i=0;
        int num= Integer.parseInt(sc.nextLine());
        double drugPrice, surgPrice, labPrice;

        if(num==1) {
            drugPrice = Double.parseDouble(sc.nextLine());
            surgPrice = Double.parseDouble(sc.nextLine());
            i++;
            mClinic[i] = new Eyepatient(drugPrice, surgPrice);
        }
        else {
            drugPrice = Double.parseDouble(sc.nextLine());
            labPrice = Double.parseDouble(sc.nextLine());
            i++;
            mClinic[i] = new Eyepatient(drugPrice, labPrice);
        }

    }
}
