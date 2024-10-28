package Proj.library.model;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class GenericModel {
    @Id
    @Column(name = "id") // если не задать имя, то java сегенирует имена с camelCase
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_generator")
    private Long id;

    @Column(name = "created_when")
    private LocalDate createdWhen;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "birth_when")
    private LocalDate deletedWhen;

    @Column(name = "deleted_by")
    private String deletedBy;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private Boolean isDeleted;
}
