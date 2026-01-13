package Java_training;

import java.util.Scanner;

public class StaticBlock{
	static {
		int a=10; //local
		System.out.println("SB1");
		System.out.println(a);
	}
	static { // this is a static block.
		System.out.println("SB2");
	}
	public static void main(String args[]) {
		System.out.println("main");
	}
	static {
		System.out.println("SB3");
	}
}

/* Output :
    SB1
    10
    SB2
    Sb3
    main    
The static block is executed before the main method, even if they are placed fter the main method.
*/
