package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import java.util.Arrays;

@Aspect
public class Aop {
    @Before("execution(public void aop.Boy.run())")
    public void beforeEnter(JoinPoint joinPoint) {
        System.out.println("[BEFORE] 얼굴 인식 확인 : 문을 개방하라");
        System.out.println("[BEFORE] 다음 실행될 메서드 시그니처 : " + joinPoint.getSignature());
        System.out.println("[BEFORE] 다음 실행될 메서드 매개변수 : " + Arrays.toString(joinPoint.getArgs()));
        System.out.println();
    }

    @Before("execution(public void aop.Boy.run(String[], int))")
    public void beforeGame(JoinPoint joinPoint) {
        System.out.println("[BEFORE] 게임 실행 중...");
        System.out.println("[BEFORE] 오늘 할 게임 목록 : " + String.join(", ", (String[])joinPoint.getArgs()[0]));
        System.out.println("[BEFORE] 오늘 목표 시간 : " + joinPoint.getArgs()[1] + "시간");
        System.out.println();
    }

    @After("execution(public void aop.Boy.run(String[], int))")
    public void afterGame(JoinPoint joinPoint) {
        System.out.println();
        System.out.println("[AFTER] 게임 로그아웃 중...");
        System.out.println("[AFTER] 게임 종료 중...");
        System.out.println("[AFTER] 시스템 종료 중...");
    }
}
