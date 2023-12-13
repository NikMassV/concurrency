package edu.nm.concurrency.aspect.closet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

    private static final String POINTCUT = "execution(public String edu.nm.concurrency.aspect.closet.AspectDemoBean.*(..))";

    @Before(POINTCUT)
    public void checkBefore(JoinPoint point) {
        System.out.println("Before advice: " + point.getSignature().getName());
    }

    @Around(POINTCUT)
    public Object checkAround(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Around advice started: " + point.getSignature().getName());
        Object proceed = point.proceed();
        System.out.println("Around advice finished: " + point.getSignature().getName());
        return proceed;
    }

    @After(POINTCUT)
    public void checkAfter(JoinPoint point) {
        System.out.println("After advice: " + point.getSignature().getName());
    }

    @AfterReturning(pointcut = POINTCUT, returning = "returningValue")
    public void checkAfterReturning(JoinPoint point, Object returningValue) {
        System.out.println("AfterReturning advice: " + point.getSignature().getName() + " " + returningValue);
    }

    @AfterThrowing(pointcut = POINTCUT, throwing = "exception")
    public void checkAfterThrowing(JoinPoint point, Exception exception) {
        exception.printStackTrace(System.out);
    }
}
