import models.ClassA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        // create application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // access bean by function name
        var object1 = context.getBean("objectOne", ClassA.class);
        // access bean by name captured by @Bean annotation
        var object2 = context.getBean("Two", ClassA.class);
        // access primary bean amongst beans of the same class
        var object3 = context.getBean(ClassA.class);
        // access bean of a base class
        var object4 = context.getBean(Integer.class);

        System.out.println("Bean object name: " + object1.getName());
        System.out.println("Bean object name: " + object2.getName());
        System.out.println("Bean object name: " + object3.getName());
        System.out.println("Integer Bean value: " + object4);
    }
}
