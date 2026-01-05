package patterns.creational.factory;

public class UPI implements Payment{
    @Override
    public void process(int amount) {
        System.out.println("Processing UPI Payment for: " + amount);
    }
}
