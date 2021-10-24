package WeekTwoAdditionalProgram;

public class checkNumberpresent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {10,20,30,40,30};
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==30) {
			System.out.println("Number found");
			System.out.print(a[i]);
			break;
		}
	}
	}

}
