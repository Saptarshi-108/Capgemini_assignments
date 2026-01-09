public class Solution {
	public static void main(String[] args) {
    int num=567;
		int summa=0;
		do {
			int b = num%10;
			num=num/10;
			summa+=b;
		}
		while (num>0);
		System.out.println(summa);
	}
}
