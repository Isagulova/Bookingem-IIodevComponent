import org.springframework.stereotype.Component;

@Component
public class Publisher
{
    private String name;
    private String place;

    public String getName() {
        return name;
    }

    public String getPlace() {
        return "Шекер";
    }
}
