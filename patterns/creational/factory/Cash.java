package patterns.creational.factory;

public class Cash implements Payment{
    @Override
    public void process(int amount) {
        System.out.println("Processing Cash Payment for: " + amount);
    }
}
