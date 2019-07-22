package crud.backend.repository;

import crud.backend.entity.Departments;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentsRepo extends JpaRepository<Departments, Long> {

    List<Departments> findAllBy(Pageable pageable);

    List<Departments> findByNameLikeIgnoreCase(String nameFilter);

    // For lazy loading and filtering
    List<Departments> findByNameLikeIgnoreCase(String nameFilter, Pageable pageable);

    long countByNameLikeIgnoreCase(String nameFilter);
}
