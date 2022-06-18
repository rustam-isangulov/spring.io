package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DoNotExecuteAspect {
    @Around("@annotation(DoNotExecute)")
    public void skipExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        // retrieve signature of the method that is being processed
        var methodName = joinPoint.getSignature();

        System.out.println("Cancelling the call of [" + methodName + "] method");
    }
}
