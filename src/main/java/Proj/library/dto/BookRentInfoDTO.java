package Proj.library.dto;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookRentInfoDTO extends GenericDTO {
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
    private Boolean returned;
    private Integer rentPeriod;
    private Long bookId;
    private Long userId;
}