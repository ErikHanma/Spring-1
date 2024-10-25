package Proj.library.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table (name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(name = "id") // если не задать имя, то java сегенирует имена с camelCase

    @Generated(strategy = GenerationType.SEQUENCE, generator = "default_generator")
    private Long id;

    @Column(name = "title", nullable = false)
    private String bookTitle;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "publish_date", nullable = false)
    private LocalDate publishDate;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "storage_place", nullable = false)
    private String storagePlace;

    @Column(name = "online_copy_path")
    private String onlineCopyPath;

    @Column(name = "genre", nullable = false)
    @Enumerated (value = EnumType.STRING)
    private Genre genre;

}
