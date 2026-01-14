package oops;
class A {
    private int x;
    void setX(int x) { this.x = x; }
    int getX() { return x; }
}

class B extends A {
    private int y;
    void setY(int y) { this.y = y; }
    int getY() { return y; }
}

class C extends B {
    int sum() { return getX() + getY(); }

    public static void main(String[] args) {
        C c = new C();
        c.setX(10);
        c.setY(20);
        System.out.println(c.sum());
    }
}
