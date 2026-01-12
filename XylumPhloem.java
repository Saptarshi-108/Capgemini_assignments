import java.util.Scanner;

class XylumPhloem {
    static void check(int n) {
        int last = n % 10;
        int first = 0, sum = 0;
        n /= 10;
        while (n > 9) {
            sum += n % 10;
            n /= 10;
        }
        first = n;
        if (first + last == sum)
            System.out.println("Xylum");
        else
            System.out.println("Phloem");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
