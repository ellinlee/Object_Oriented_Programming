
public class Employee {
	String Id;
	String Name;
	String Job_Level;
	double Salary;
	String Address;
	
	//method 
	public void print() {
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(Job_Level);
		System.out.println(Salary);
		System.out.println(Address);
	}
	
	public void netSalary(double overtime) {
		double netsalary;
		
		if (overtime==0) {
			netsalary=this.Salary;
		}
		else if(overtime<10) {
			netsalary=this.Salary+overtime*7.5;
		}
		else {
			netsalary=this.Salary+10*7.5+(overtime-10)*5;
		}
		
		System.out.println(netsalary);
	}

	//constructor
	
	public Employee(String N, String A) {
		Name=N;
		Address=A;	
	}
	
	public Employee(String I, String N,String J,double S, String A) {
		Id=I;
		Name=N;
		Job_Level=J;
		Salary=S;
		Address=A;	
	}
	
	public static void main(String[] args) {
			Employee myEmp1=new Employee("이은채","suwon");
			Employee myEmp2=new Employee("123","이은채","mid",200,"suwon");
			System.out.print(myEmp1.Name);
			System.out.print("\n");
			System.out.print(myEmp1.Address);
			System.out.print("\n");
			myEmp2.netSalary(20);
		}
}
