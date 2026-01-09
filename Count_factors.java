//Count how many factors are there for 30

package Java_training;

public class Count_factors{
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 30; i++) {
            if (30 % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
