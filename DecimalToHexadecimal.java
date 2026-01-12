import java.util.Scanner;

class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] hex = new char[20];
        int i = 0;
        while (n > 0) {
            int r = n % 16;
            if (r < 10)
                hex[i] = (char)(r + 48);
            else
                hex[i] = (char)(r + 55);
            i++;
            n = n / 16;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(hex[j]);
    }
}
