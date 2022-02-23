package com.tmsolutions.parkingcontrol.services;

import com.tmsolutions.parkingcontrol.models.ParkingSpotModel;
import com.tmsolutions.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final
    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

}
