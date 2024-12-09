package kg.Isagulova.bookingem;

import org.springframework.stereotype.Component;
//Басмачы жана басмакананын аттары
@Component
public class Publisher
{
    private String name;
    private String place = "Зээн";

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}
