package patterns.creational.factory;

public class FactoryDemo {
    public static void run(){
        Payment payment = Factory.getPaymentInstance("Cash");
        payment.process(100);
    }
}
