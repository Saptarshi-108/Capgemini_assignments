package abstraction;

abstract class Bank {
    public abstract void getInterestRate();
}

class SBI extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    @Override
    public void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}


public class BankDriver {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.getInterestRate();
        b2.getInterestRate();
    }
}
