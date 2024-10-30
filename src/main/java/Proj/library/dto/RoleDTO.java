package Proj.library.dto;

import lombok.*;
import org.springframework.data.repository.NoRepositoryBean;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleDTO {
    private Long id;
    private String title;
    private String description;
}
