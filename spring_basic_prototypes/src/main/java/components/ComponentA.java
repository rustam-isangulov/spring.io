package components;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ComponentA {
    private String name;
    private static int sequenceNumber;

    public ComponentA() {
        System.out.println("Constructor of " + this.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void postConstructConfig() {
        this.name = String.format("Object number [%d] of class [%s]"
                , ++sequenceNumber, this.getClass().getName());
    }
}
