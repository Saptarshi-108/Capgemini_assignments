package collection_framework;
import java.util.ArrayList;

public class ArrayList_learning {
	public static void main(String args[]) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("D");
		a2.add("E");
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2,a2);
		System.out.println(a1);
		
	}
}
