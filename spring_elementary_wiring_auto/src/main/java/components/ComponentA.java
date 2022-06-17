package components;

import models.ClassA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    private final String name;
    private final ClassA objectA;

    @Autowired                                                 // @Autowired is optional for a single constructor
    public ComponentA(@Qualifier("objectA1") ClassA objectA) { // Dependency Injection by Spring
        this.objectA = objectA;                                // use @Qualifier to select a bean of ClassA
        this.name = "component of type ComponentA";
    }

    public String getName() {
        return name;
    }

    public ClassA getObjectA() {
        return objectA;
    }
}
