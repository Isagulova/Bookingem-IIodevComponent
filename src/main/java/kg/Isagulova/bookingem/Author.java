package kg.Isagulova.bookingem;

import org.springframework.stereotype.Component;
//Авторубуздун аты жөнү жана биографиясы
@Component
public class Author {
    private String name = "Чынгыз Айтматов";
    private String biography;

    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }

}
