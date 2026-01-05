package patterns.creational.factory;

public class Card implements Payment{
    @Override
    public void process(int amount) {
        System.out.println("Processing Card Payment for: " + amount);
    }
}
