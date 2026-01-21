package assessments;

import java.lang.String;

public class StringBufferPrograms {
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("xyz");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.reverse());
		System.out.println(s1.reverse());
		
		String s=new String(s1); // convert SB -> string
		StringBuffer s3 = new StringBuffer(s); // convert String -> SB
		StringBuilder s4= new StringBuilder("abc"); 
		
		s1.append(" cinncinati");
		System.out.println(s1);
		
		StringBuffer s5= new StringBuffer();
		System.out.println(s1.capacity());
//		s5.trimToSize();
		System.out.println(s5);
		
		StringBuffer s6 = new StringBuffer("xyz");
		s6.insert(1,"abc");
		System.out.println(s6);
		
		StringBuffer s7 = new StringBuffer("xyz abc");
		s7.delete(0,2);
		System.out.println(s3);
		
		StringBuffer s8 = new StringBuffer("xyz abc");
		s7.replace(0, 2, "hiiii");
		System.out.println(s7);
	}
}
