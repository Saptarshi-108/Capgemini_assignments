import java.util.Scanner;

class StrongNumber {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n));
    }
}
