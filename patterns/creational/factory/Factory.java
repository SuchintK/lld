package patterns.creational.factory;

public class Factory {
    public static Payment getPaymentInstance(String paymentType){
        return switch (paymentType){
            case "Card" -> new Card();
            case "Cash" -> new Cash();
            default -> new UPI();
        };
    }
}
