package parkinglot.entities.gate;

import java.util.Random;

public class ExitGate extends Gate{
    public ExitGate(){
        super(new Random().nextInt());
    }

    @Override
    public void open() {
        System.out.println("Opening the Exit Gate!");
    }

    @Override
    public void close() {
        System.out.println("Closing the Exit Gate!");
    }
}
