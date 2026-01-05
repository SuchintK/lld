package patterns.creational.builder;

public class BuilderDemo {
    public static void run(){
        Car car = new Car.CarBuilder().setName("Tata").setPrice(100000).setModelNumber("XUV").build();
    }
}
