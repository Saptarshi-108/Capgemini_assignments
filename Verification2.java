package oops;
class Account {
    private String name;
    private int bal;
    private String pass;

    public void setAcc(String n, int b, String p) {
        name = n;
        bal = b;
        pass = p;
    }

    public int getBal(String p) {
        if (pass.equals(p)) {
            return bal;
        }
        return -1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAcc("John", 1000, "1111");

        int b = a.getBal("1111");
        if (b != -1) {
            System.out.println("Balance: " + b);
        } else {
            System.out.println("Access denied");
        }
    }
}
