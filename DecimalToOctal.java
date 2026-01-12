import java.util.Scanner;

class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oct = 0;
        int p = 1;
        while (n > 0) {
            oct = oct + (n % 8) * p;
            p = p * 10;
            n = n / 8;
        }
        System.out.println(oct);
    }
}
