package crud.vaadin;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;
import crud.backend.entity.Departments;
import crud.backend.repository.DepartmentsRepo;
import org.vaadin.spring.events.EventBus;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.form.AbstractForm;
import org.vaadin.viritin.layouts.MFormLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;

@UIScope
@SpringComponent
public class DepartmentForm extends AbstractForm<Departments> {

    private static final long serialVersionUID = 1L;

    EventBus.UIEventBus eventBus;
    DepartmentsRepo repo;

    TextField name = new MTextField("Name");

    DepartmentForm(DepartmentsRepo r, EventBus.UIEventBus b) {
        super(Departments.class);
        this.repo = r;
        this.eventBus = b;

        // On save & cancel, publish events that other parts of the UI can listen
        setSavedHandler(departments -> {
            // persist changes
            repo.save(departments);
            // send the event for other parts of the application
            eventBus.publish(this, new DepartmentModifiedEvent(departments));
        });
        setResetHandler(p -> eventBus.publish(this, new DepartmentModifiedEvent(p)));

        setSizeUndefined();
    }


    @Override
    protected Component createContent() {
        return new MVerticalLayout(
                new MFormLayout(
                        name
                ).withWidth(""),
                getToolbar()
        ).withWidth("");
    }

}
