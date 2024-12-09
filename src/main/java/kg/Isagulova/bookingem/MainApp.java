package kg.Isagulova.bookingem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        //XML КЛАСС/ АННОТАЦИЯЛАРДЫН(@Component & @Autowired) ЖАРДАМЫ менен түзүлгөн конфигурация
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Book классынын бинин(book) алабыз
        Book book = context.getBean("book", Book.class);
        //Андагы takeBook() методун чакырабыз
        System.out.println(book.takeBook());
    }
}
