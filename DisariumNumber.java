import java.util.Scanner;

class DisariumNumber {
    static int power(int b, int e) {
        int r = 1;
        for (int i = 1; i <= e; i++) {
            r = r * b;
        }
        return r;
    }

    static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

    static boolean isDisarium(int n) {
        int temp = n;
        int pos = count(n);
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum = sum + power(d, pos);
            pos--;
            temp = temp / 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDisarium(n));
    }
}
