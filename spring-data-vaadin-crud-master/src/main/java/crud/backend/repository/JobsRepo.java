package crud.backend.repository;

import crud.backend.entity.Jobs;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobsRepo extends JpaRepository<Jobs, Long> {

    List<Jobs> findAllBy(Pageable pageable);

    List<Jobs> findByNameLikeIgnoreCase(String nameFilter);

    // For lazy loading and filtering
    List<Jobs> findByNameLikeIgnoreCase(String nameFilter, Pageable pageable);

    long countByNameLikeIgnoreCase(String nameFilter);
}
