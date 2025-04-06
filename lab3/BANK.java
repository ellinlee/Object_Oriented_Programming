public class BANK {
	int myBalance() {
		return 0;
	}
	
	public static void main(String[] args) {
		BankX X = new BankX();
		BankY Y = new BankY();
		BankZ Z = new BankZ();
		
		int x = X.myBalance();
		int y = Y.myBalance();
		int z = Z.myBalance();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class BankX extends BANK{
	int myBalance() {
		return 500;
	}
}

class BankY extends BANK{
	int myBalance() {
		return 800;
	}
}

class BankZ extends BANK{
	int myBalance() {
		return 1200;
	}
}
