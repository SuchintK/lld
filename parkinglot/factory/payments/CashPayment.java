package parkinglot.factory.payments;

public class CashPayment implements Payment{
    @Override
    public boolean pay(int amount) {
        System.out.println("Making payment using cash for amount: " + amount);
        return true;
    }
}
