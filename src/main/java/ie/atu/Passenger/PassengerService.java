package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers()
    {
      return passengerRepo.findAll();
    }

    public Passenger getPassenger( String passengerPhone)
    {
        Passenger myPassenger = new Passenger("Mr", "Cian", "12345678897876", 24, 45L);
        return myPassenger;
    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public void deletePassenger(Long count){
        passengerRepo.deleteById(count);
    }

    public Passenger findPassengerByName(String name){
       return passengerRepo.findPassengerByName(name);
    }

    public List<Passenger> findPassengerByAgeRange(int age1, int age2){
        return passengerRepo.findPassengerByAge(age1, age2);
    }
}
