package parkinglot.states;

import parkinglot.entities.Ticket;

public interface State {
    public void eject(Ticket ticket);
    public void payment(Ticket ticket);
    public void complete(Ticket ticket);
}
