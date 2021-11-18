import com.hotelReservatio.Hotel;
import com.hotelReservatio.HotelReservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HotelManagement {
    HotelReservation hotelReservation = new HotelReservation();

    Hotel lakewood = new Hotel("Lakewood", 110);
    Hotel bridgewood = new Hotel("Bridgewood", 150);
    Hotel ridgewood = new Hotel("Ridgewood", 220);

    @Test
    public void addHotelTest() {
        ArrayList<Hotel> hotel1 = hotelReservation.addHotel(lakewood);
        ArrayList<Hotel> hotel2 = hotelReservation.addHotel(bridgewood);
        ArrayList<Hotel> hotel3 = hotelReservation.addHotel(ridgewood);
        Assertions.assertTrue(hotel1.contains(lakewood));
        Assertions.assertTrue(hotel1.contains(bridgewood));
        Assertions.assertTrue(hotel1.contains(ridgewood));

        hotelReservation.printHotels();
    }
}

