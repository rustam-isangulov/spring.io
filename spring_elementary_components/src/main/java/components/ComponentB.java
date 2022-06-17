package components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComponentB {
    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void InitAfterBeanCreation() {
        this.name = "ComponentB object /initialized PostConstruct/";
    }
}
