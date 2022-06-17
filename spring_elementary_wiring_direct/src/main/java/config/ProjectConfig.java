package config;

import models.ClassA;
import models.ClassB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class ProjectConfig {
    @Bean
    public ClassA objectA1() {
        ClassA obj = new ClassA();
        obj.setName("Object 1 of Class A");

        return obj;
    }

    @Bean
    @Primary                            // mark this bean as primary for ClassA
    public ClassA objectA2() {
        ClassA obj = new ClassA();
        obj.setName("Object 2 of Class A");

        return obj;
    }

    @Bean("B1")
    public ClassB objectB1() {
        ClassB obj = new ClassB();
        obj.setName("Object 1 of Class B");
        obj.setLinkToA(objectA1());        // linking using direct call to access objectA1 bean

        return obj;
    }

    @Bean("B2")
    public ClassB objectB2(ClassA objA) {  // using Dependency Injection by Spring framework
        ClassB obj = new ClassB();
        obj.setName("Object 2 of Class B");
        obj.setLinkToA(objA);              // linking to the primary beann of type ClassA

        return obj;
    }
}
