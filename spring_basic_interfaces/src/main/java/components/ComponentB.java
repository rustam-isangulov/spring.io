package components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("B")
public class ComponentB implements ComponentInterface {
    @Override
    public void process() {
        System.out.println("Processing in [" + this.getClass().getName() + "]");
    }
}
