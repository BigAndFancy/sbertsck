package crud.backend.repository;


import crud.backend.entity.Officers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OfficersRepo extends JpaRepository<Officers, Long> {
}