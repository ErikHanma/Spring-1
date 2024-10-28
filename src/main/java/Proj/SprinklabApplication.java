package Proj;

import Proj.dbexamples.dao.BookDAOBean;
import Proj.dbexamples.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SprinklabApplication implements CommandLineRunner {

//    private BookDAOBean bookDAOBean;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    public SprinklabApplication(BookDAOBean bookDAOBean) {
//        this.bookDAOBean = bookDAOBean;
//    }

    public static void main(String[] args) {
        SpringApplication.run(SprinklabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Шаг 1
        // BookDaoJDBC bookDaoJDBC = new BookDaoJDBC();
        // System.out.println(bookDAOBean.findBookById(4));
        // bookDAOBean.findBookById(4);

//        List<Book> bookList = jdbcTemplate.query("select * from books",
//                (rs, rowNum) -> new Book(
//                        rs.getInt("id"),
//                        rs.getString("title"),
//                        rs.getString("author"),
//                        rs.getDate("date_added")
//                ));
//        bookList.forEach(System.out::println);
    }
}