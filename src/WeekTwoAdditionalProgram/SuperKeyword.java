package WeekTwoAdditionalProgram;
class Employee{
	int empID;
	String empName;
	final String compName= "ABC Pvt LTd.";
	Employee(int empID, String empName ) {
		this.empID=empID;
		this.empName=empName;
		this.print();
		// TODO Auto-generated constructor stub
	}
	void print() {
		System.out.println("Hello");
	}
}
class Employee2 extends Employee{
	double salary;
	public Employee2(int empID, String empName, double salary) {
	
		super(empID, empName);
			this.salary=salary;
		// TODO Auto-generated constructor stub
	}	
	void print() {
		System.out.print(super.empID+" "+super.empName+" "+this.salary);
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e= new Employee2(102,"Sehbas",100.0);
		System.out.print(e.empID);

	}

}
