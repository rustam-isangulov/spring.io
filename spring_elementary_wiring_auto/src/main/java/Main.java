import components.ComponentA;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access a component in the application context
        var component = context.getBean(ComponentA.class);

        // print component links information
        System.out.format("Component [%s] is linked to [%s]"
                , component.getName(), component.getObjectA().getName());
    }
}
