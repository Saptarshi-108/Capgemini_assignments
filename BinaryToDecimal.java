import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int d = 0;
        int p = 1;
        while (b > 0) {
            int r = b % 10;
            d = d + r * p;
            p = p * 2;
            b = b / 10;
        }
        System.out.println(d);
    }
}
