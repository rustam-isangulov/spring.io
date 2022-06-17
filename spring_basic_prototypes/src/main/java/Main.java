import components.ComponentA;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ServiceA;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access component prototype in the context
        var component1 = context.getBean(ComponentA.class);
        var component2 = context.getBean(ComponentA.class);

        // use components
        System.out.println(component1.getName());
        System.out.println(component2.getName());

        System.out.println();

        // access service bean in the context
        var service = context.getBean(ServiceA.class);

        // use the service object
        service.process();
    }
}
