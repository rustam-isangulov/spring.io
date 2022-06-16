import models.ClassA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    ClassA objectOne() {
        return new ClassA("One");
    }

    @Bean("Two")
    ClassA objectTwo() {
        return new ClassA("Two");
    }

    @Bean
    @Primary
    ClassA objectThree() {
        return new ClassA("Three");
    }

    @Bean
    Integer number() {
        return 42;
    }
}
