package parkinglot.entities.gate;

public abstract class Gate {
    public int id;

    public Gate(int id){
        this.id = id;
    }

    public abstract void open();
    public abstract void close();
}
