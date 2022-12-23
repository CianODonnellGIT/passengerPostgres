package ie.atu.Passenger;



import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {

    PassengerService myService;


    public PassengerController(PassengerService myService){
        this.myService = myService;
    }

    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myService.getPassengers();
    }

    @GetMapping("/{passengerPhone}")
    public Passenger getPassenger(@PathVariable String passengerPhone)
    {

        return myService.getPassenger(passengerPhone);
    }

    //save data
    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }

    //find by ...
    @GetMapping("/name/{name}")
    public Passenger getPassengerName(@PathVariable("name") String name)
    {
        return myService.findPassengerByName(name);
    }

    //Delete operation
    @DeleteMapping("delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count){
        myService.deletePassenger(count);
    }

    // http://localhost:8081/api/passenger/age?age_start=1&age_end=10
    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name = "age_end")int age2)
    {
        return myService.findPassengerByAgeRange(age1, age2);
    }

}
