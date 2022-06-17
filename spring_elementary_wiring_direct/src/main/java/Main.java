import config.ProjectConfig;
import models.ClassB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access ClassB beans in the context
        var objB1 = context.getBean("B1", ClassB.class);
        var objB2 = context.getBean("B2", ClassB.class);

        // print object links information
        System.out.format("Object [%s] is linked to [%s]"
                , objB1.getName(), objB1.getLinkToA().getName());

        System.out.println();

        System.out.format("Object [%s] is linked to [%s]"
                , objB2.getName(), objB2.getLinkToA().getName());
    }
}
