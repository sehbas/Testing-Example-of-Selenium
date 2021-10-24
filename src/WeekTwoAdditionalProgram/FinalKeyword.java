package WeekTwoAdditionalProgram;
class EmployeeThree{
	int empID;
	String empName;
	final String comName= "ABC Private Limitd";
	EmployeeThree(int empID, String empName ) {
		this.empID=empID;
		this.empName=empName;
		this.print();
		// TODO Auto-generated constructor stub
	}
	void print() {
		System.out.println("Hello");
	}
}
class Employee12 extends Employee{
	double salary;
	public Employee12(int empID, String empName, double salary) {
	
		super(empID, empName);
			this.salary=salary;
		// TODO Auto-generated constructor stub
	}	
	void print() {
		System.out.print(super.empID+" "+super.empName+" "+this.salary);
	}
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
