package crud.backend.entity;
import crud.backend.entity.Departments;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Jobs {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // IDENTITY as the example has flyway in it and fixed schema in src/main/resources/db/migration
    private long id;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "hours", nullable = false)
    private int hours;

    @ManyToOne
    @OrderBy("id_departments")
    private Departments departments;

    public Jobs() {
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
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
