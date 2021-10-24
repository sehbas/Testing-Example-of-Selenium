package WeekTwoAdditionalProgram;
class EmployeeOne{
	int empID;
	String empName;
	public EmployeeOne(int empID, String empName ) {
		this.empID=empID;
		this.empName=empName;
		this.print();
		// TODO Auto-generated constructor stub
	}
	void print() {
		System.out.println("Hello");
	}
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeOne e= new EmployeeOne(101,"Sehbas");
		System.out.println(e.empID);
	}

}
