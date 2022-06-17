package services;

import components.ComponentA;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    // context reference to request prototype beans
    private final ApplicationContext context;

    public ServiceA(ApplicationContext context) {
        this.context = context;
    }

    public void process() {
        // create an object from the prototype
        var component = context.getBean(ComponentA.class);

        // use the prototype-based object
        System.out.format("Service object of type [%s] is calling component [%s]"
                , this.getClass().getName(), component.getName());
    }
}
