package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import java.util.Arrays;

@Aspect
public class Aop {
    @Before("execution(public void aop.Boy.run ())")
    public void before(JoinPoint joinPoint) {
        System.out.println("[BEFORE] 얼굴 인식 확인 : 문을 개방하라");
        System.out.println("[BEFORE] 다음 실행될 메서드 시그니처 : " + joinPoint.getSignature());
        System.out.println("[BEFORE] 다음 실행될 메서드 매개변수 : " + Arrays.toString(joinPoint.getArgs()));
    }



}
