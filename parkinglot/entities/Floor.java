package parkinglot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Floor {
    public List<ParkingSpot> parkingSpots;
}
