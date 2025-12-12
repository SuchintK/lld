package parkinglot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import parkinglot.enums.ParkingSpotStatus;
import parkinglot.enums.ParkingSpotStatus;
import parkinglot.enums.VehicleType;

@Data
@AllArgsConstructor
public class ParkingSpot {
    public int id;
    public VehicleType vehicleType;
    public ParkingSpotStatus status;
    public Vehicle vehicle;
}
