package kg.Isagulova.bookingem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    //Китебибиздин аты
    @Value("${book.name}")
    private String name;
    //Китебибиздин жарыяланган жылы
    @Value("${book.yearOfPublishing}")
    private int yearOfPublishing;
    //Көз карандылыктар
    private Author author;
    private Publisher publisher;

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
//Автоматтык түрдө көз карандылыктарды инъекциялоо
    @Autowired
    public Book(Author author, Publisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }

//Китебибиз тууралуу маалымат бере турчу метод
public String takeBook(){
        return author.getName() + "дун " + getName() + " аттуу китеби " +  getYearOfPublishing() + " - жылы " + publisher.getPlace() + " басмаканасында басылып чыгарылган.";
}
}
