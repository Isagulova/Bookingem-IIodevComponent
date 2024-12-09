import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${book.properties}")
    private String name;
    @Value("${book.properties}")
    private int yearOfPublishing;
    private Author author;
    private Publisher publisher;

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Autowired
    public Book(Author author, Publisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }
public String takeBook(){
        return author.getName() + "дын " + getName() + " аттуу китеби " +  getYearOfPublishing() + " - жылы " + publisher.getPlace() + " аттуу жерде басылып чыгарылган.";
}
}
