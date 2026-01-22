package exception;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }

    static void checkAge(int age) {
        if (age <= 0 || age > 120) {
            throw new AgeException("Invalid age: " + age);
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            int age1 = -10;
            checkAge(age1);
            
            int age2 = 25;
            checkAge(age2);

        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
