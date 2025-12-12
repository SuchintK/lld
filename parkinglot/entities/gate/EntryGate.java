package parkinglot.entities.gate;

import java.util.Random;

public class EntryGate extends Gate{
    public EntryGate(){
        super(new Random().nextInt());
    }

    @Override
    public void open() {
        System.out.println("Opening the Entry Gate!");
    }

    @Override
    public void close() {
        System.out.println("Closing the Entry Gate!");
    }
}
