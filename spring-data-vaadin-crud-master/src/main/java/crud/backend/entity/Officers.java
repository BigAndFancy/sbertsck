package crud.backend.entity;
import crud.backend.entity.Jobs;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "officers")
public class Officers {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // IDENTITY as the example has flyway in it and fixed schema in src/main/resources/db/migration
    private long id;

    @Column(name = "first_name", length = 64, nullable = false)
    private String first_name;

    @Column(name = "last_name", length = 64, nullable = false)
    private String last_name;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @ManyToOne
    @OrderBy("id_job")
    private Jobs jobs;

    public Officers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String setLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
