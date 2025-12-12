package parkinglot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    public int id;
    public String registrationNumber;
}
