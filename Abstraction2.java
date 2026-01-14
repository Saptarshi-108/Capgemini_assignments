package oops;

class App {
    float version;
    Boolean encryption;

    public App(float version, Boolean encryption) {
        this.version = version;
        this.encryption = encryption;
    }
}

public class Whatsapp extends App {
    double phone;

    public Whatsapp(float version, Boolean encryption, double phone) {
        super(version, encryption);
        this.phone = phone;
    }

    public static void main(String[] args) {
        Whatsapp a = new Whatsapp(2.5f, true, 240.56);

        System.out.println(a.version);
        System.out.println(a.encryption);
        System.out.println(a.phone);

        App f = new App(1.0f, false);
        System.out.println(f.version);
    }
}
