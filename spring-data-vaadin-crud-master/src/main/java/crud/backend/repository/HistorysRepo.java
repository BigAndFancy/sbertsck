package crud.backend.repository;


import crud.backend.entity.Historys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorysRepo extends JpaRepository<Historys, Long> {

}