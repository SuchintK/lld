package parkinglot.factory.payments;

public class CardPayment implements Payment{
    @Override
    public boolean pay(int amount) {
        System.out.println("Making payment using card for amount: " + amount);
        return true;
    }
}
