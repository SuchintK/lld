package patterns.creational.builder;

public class Car {
    private String name;
    private String modelNumber;
    private int price;

    private Car(CarBuilder carBuilder){
        this.modelNumber = carBuilder.modelNumber;
        this.name = carBuilder.name;
        this.price = carBuilder.price;
    }

    public String getName() {
        return name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getPrice() {
        return price;
    }

    public static class CarBuilder{
        private String name;
        private String modelNumber;
        private int price;

        public CarBuilder setName(String name){
            this.name = name;
            return this;
        }

        public CarBuilder setModelNumber(String modelNumber){
            this.modelNumber = modelNumber;
            return this;
        }

        public CarBuilder setPrice(int price){
            this.price = price;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
