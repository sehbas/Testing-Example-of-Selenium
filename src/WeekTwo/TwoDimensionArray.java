package WeekTwo;

/**
 * @author PC
 *
 */
public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arryA= {{10,20,30},{40,50,60,},{70,80,90}};
		int [][]arryB= {{100,200,300},{400,500,600},{700,800,900}};
		int [][]arryC=new int[3][3];
		
		for(int row=0;row<=2;row++) {
	
			for(int col=0; col<=2; col++) {
				arryC[row][col]=arryA[row][col]+arryB[row][col];
				System.out.print(arryC[row][col]+ " ");
			}
			System.out.println();
		}

	}
}	
