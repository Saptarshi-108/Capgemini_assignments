package oops;

class User {
    private String name;
    private String pass;

    public void setData(String n, String p) {
        name = n;
        pass = p;
    }

    public String getName() {
        return name;
    }

    public boolean checkPass(String p) {
        return pass.equals(p);
    }
}

public class Main1 {
    public static void main(String[] args) {
        User u = new User();
        u.setData("admin", "1234");

        if (u.checkPass("1234")) {
            System.out.println("Login OK");
        } else {
            System.out.println("Wrong password");
        }
    }
}
