package parkinglot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import parkinglot.enums.TicketStatus;
import parkinglot.factory.payments.Payment;
import parkinglot.states.State;

import java.sql.Time;

@Data
@AllArgsConstructor
public class Ticket {
    public int id;
    public State state;
    public TicketStatus ticketStatus;
    public ParkingSpot parkingSpot;
    public Vehicle vehicle;
    public Payment payment;
    public Time entryTime;
    public Time exitTime;
}
