package day1;

import java.util.Iterator;

public class loops_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// For Loop
		
		for (int i=2; i<=20;) {
			System.out.println(i);
			i=i+2;
		}
		//While Loop
		int counter=1;
		while (counter<=10) {
			System.out.println(counter);
			counter++;
		}
		
		//Do While 
		
		int d=11;
		do {
			System.out.println(d);
			d++;
		} while (d<=20);
	}

}
