package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrePostProcessingAspect {

    @Around("execution(* services.*.*(..))")
    void addProcessing(ProceedingJoinPoint joinPoint) throws Throwable {
        // retrieve signature of the method that is being processed
        var methodName = joinPoint.getSignature();
        // retrieve arguments as an array
        Object[] methodArguments = joinPoint.getArgs();

        // retrieve String data from the first parameter
        String data = "";
        if (methodArguments.length > 0 && methodArguments[0] instanceof String) {
            data = (String)methodArguments[0];
        }

        System.out.println("Pre-processing for : [" + methodName + "] with the first param: [" + data + "]");
        joinPoint.proceed();
        System.out.println("Post-processing for : [" + methodName  + "] with the first param: [" + data + "]");
    }
}
