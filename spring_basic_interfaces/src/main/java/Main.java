import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ServiceA;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access service in the context
        var service = context.getBean(ServiceA.class);

        // use the service
        service.Compute();
    }
}
