package parkinglot.factory.payments;

public class UPIPayment implements Payment{
    @Override
    public boolean pay(int amount) {
        System.out.println("Making payment using UPI for amount: " + amount);
        return true;
    }
}
