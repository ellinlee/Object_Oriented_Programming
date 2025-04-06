
class Student{
	String StdName;
	int StdAge;
	double StdGPA;
	
	public void setName (String studentName)  {
		this.StdName=studentName;
	}
	
	public String getName() {
		return StdName;
	}
	
	public void setAge (int studentAge) {
		if(studentAge>0)
			this.StdAge = studentAge;
		else {
			System.out.println("Input is error");
			System.exit(0);
		}	
	}
	
	public int getAge() {
		return StdAge;
	}
	
	public void setGPA (double studentGPA) {
		if(studentGPA>0)
			this.StdGPA = studentGPA;
		else {
			System.out.println("Input is error");
			System.exit(0);
		}	
	}
	
	public double getGPA() {
		return StdGPA;
	}
	
}


public class StudentCreate{
	public static void main(String[] args){
		Student one = new Student();
		
		one.setName("David");
		one.setAge(22);
		one.setGPA(-2);
		
		System.out.println("Name: " + one.getName());
		System.out.println("Age: " + one.getAge());
		System.out.println("GPA: " + one.getGPA());
	}
}
