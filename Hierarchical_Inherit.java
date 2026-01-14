package oops;

class A {
    private int x;
    void setX(int x) { this.x = x; }
    int getX() { return x; }
}

class B extends A {
    int sq() { return getX() * getX(); }
}

class C extends A {
    int cb() { return getX() * getX() * getX(); }
}

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.setX(2);
        System.out.println(b.sq());

        C c = new C();
        c.setX(2);
        System.out.println(c.cb());
    }
}
