import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ServiceA;

public class Main {
    public static void main(String... args) {
        // Spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access to service in the context
        var service = context.getBean(ServiceA.class);

        // use the service
        service.process("This is data to process...");
    }
}
