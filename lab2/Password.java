package ¿Ã¿∫√§_202021711_LAb2;
import java.util.Scanner;

public class Password {
	static int PASS_LENGTH = 6;
	
	public static boolean is_Valid_Password(String s) {
		if(s.length()<PASS_LENGTH) {
			return false;
		}	
		
		int a=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))==true) {
				a++;
			}
		}
		
		if(a<3)
			return false; 
		
		
		for(int i=0; i<s.length(); i++) {
			if(!(Character.isLetterOrDigit(s.charAt(i)))) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print(
             "1. A password must have at least six characters.\n" +
             "2. A password consists of only letters and digits \n"+
             "3. A password must contain at least three digits \n"+
"Input a password (You are agreeing to the above Terms and Conditions.): ");
        
        String s = input.nextLine();
        
        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }


	}

}
