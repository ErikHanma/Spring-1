package Proj.library.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class AuthorDTO extends GenericDTO {
    private String authorName;
    private LocalDate birthDate;
    private String description;
    private List<Long> booksIds; // Чтобы исключить зациклевание, можно включить список id, а не объектов
}