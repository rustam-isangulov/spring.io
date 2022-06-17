package services;

import components.ComponentInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private final ComponentInterface component;

    public ServiceA(@Qualifier("B") ComponentInterface component) {
        this.component = component;
    }

    public void Compute() {
        component.process();
    }
}
