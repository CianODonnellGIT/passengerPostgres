package ie.atu.Passenger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {
    private Passenger passenger;

    @Test
    void testCorrectTitle() {
        passenger = new Passenger("Mr", "Cian", "2356879033", 24, 35);
        assertEquals("Cian", passenger.getName());
    }

  /*  @Test
    void testInvalidTitle() {
        final String invalid = "Invalid title";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mister", "Cian", "2356879045", 23, 33));
        assertEquals(invalid, exceptionThrown.getMessage());
    } */
}

