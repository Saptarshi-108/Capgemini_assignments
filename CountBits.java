import java.util.Scanner;

class CountBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1)
                count++;
            n = n / 2;
        }
        System.out.println(count);
    }
}
