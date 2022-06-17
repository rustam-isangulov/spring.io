package config;

import models.ClassA;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "components")
public class ProjectConfig {
    @Bean
    ClassA objectA1() {
        var obj = new ClassA();
        obj.setName("object1 of ClassA");

        return obj;
    }

    @Primary
    @Bean
    ClassA objectA2() {
        var obj = new ClassA();
        obj.setName("object2 of ClassA");

        return obj;
    }
}
