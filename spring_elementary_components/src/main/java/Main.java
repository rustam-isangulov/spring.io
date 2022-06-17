import components.ComponentA;
import components.ComponentB;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access to ComponentA in the context and initialized it
        var objectA = context.getBean(ComponentA.class);
        objectA.setName("This is ComponentA object");

        // access to ComponentB in the context
        var objectB = context.getBean(ComponentB.class);

        // use components
        System.out.println("objectA name: " + objectA.getName());
        System.out.println("objectB name: " + objectB.getName());
    }
}
