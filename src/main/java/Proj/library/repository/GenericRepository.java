package Proj.library.repository;

import Proj.library.controler.GenericController;
import Proj.library.model.GenericModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository <T extends GenericModel> extends JpaRepository<T, Long> {
}
