package crud.backend.entity;
import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY as the example has flyway in it and fixed schema in src/main/resources/db/migration
    private long id;

    @Column(name = "name",length=64, nullable = false)
    private String name;

    public Departments(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}