import org.springframework.stereotype.Component;

@Component
public class Author {
    private String name;
    private String biography;

    public String getName() {
        return "Чынгыз Айтматов";
    }

    public String getBiography() {
        return biography;
    }

}
