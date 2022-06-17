package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"components", "services"})
@Configuration
public class ProjectConfig {
}
