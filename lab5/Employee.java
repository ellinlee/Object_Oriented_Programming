public class Employee extends Person{
    private double payRate;
    private double workHours;
    private String deptName;

    public final int HOURS = 35;
    public final double OVERTIME = 1.2;

    public Employee() {
        super();
        payRate = 0.0;
        workHours = 0.0;
        deptName = " ";
    }

    public Employee(double payRate, double workHours, String deptName, String firstName, String lastName) {
        super(firstName,lastName);
        this.payRate = payRate;
        this.workHours = workHours;
        this.deptName = deptName;
    }

    public String toString() {
        return "The wages for " + super.toString() + "from the " + deptName + "department are: $" + calculatePay();
    }

    public void print() {
        System.out.println("The employee " + super.toString() + " from the " + deptName + " department worked " + workHours
                + " hours with a pay rate of $ "+ payRate + ". The wages for this employee are $" + calculatePay());
    }

    public double calculatePay() {
        if (workHours > 35) {
            return ((workHours-35)*payRate * OVERTIME) +  (35 * payRate); //wages

        } else {
            return workHours * payRate; //wages
        }
    }

    public void setAll(double payRate, double workHours, String deptName, String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.payRate = payRate;
        this.workHours = workHours;
        this.deptName = deptName;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getworkHours() {
        return workHours;
    }

    public String getdeptName() {
        return deptName;
    }

    public boolean equals(Object o) {
        Employee employ = (Employee) o;
        return  payRate == employ.payRate && workHours == employ.workHours && deptName.equalsIgnoreCase(employ.deptName);
    }

    public Employee getCopy() {
        Employee employ = new Employee();
        copy(employ);
        return employ;
    }

    public void copy(Employee employ) {
        employ.setAll(getPayRate(), getworkHours(), getdeptName(), getFirstName(), getLastName());
    }


}
