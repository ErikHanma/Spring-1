package Proj;

import Proj.dbexamples.dao.BookDAOBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@SpringBootApplication
public class SprinklabApplication implements CommandLineRunner {

    private BookDAOBean bookDAOBean;

    public SprinklabApplication(BookDAOBean bookDAOBean) {
        this.bookDAOBean = bookDAOBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(SprinklabApplication.class, args);
    }

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        // Шаг 1
//        BookDaoJDBC bookDaoJDBC = new BookDaoJDBC();
//        System.out.println(bookDAOBean.findBookById(4));
        bookDAOBean.findBookById(4);

    }
}
