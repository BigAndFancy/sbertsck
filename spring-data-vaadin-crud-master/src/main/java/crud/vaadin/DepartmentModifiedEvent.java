package crud.vaadin;

import crud.backend.entity.Departments;

import java.io.Serializable;

public class DepartmentModifiedEvent implements Serializable {

    private final Departments departments;

    public DepartmentModifiedEvent(Departments p) {
        this.departments = p;
    }

    public Departments getPerson() {
        return departments;
    }
    
}
