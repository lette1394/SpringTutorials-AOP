package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning("execution(public void aop.Boy.run(String[], int))")
    public void afterGameReturn(JoinPoint joinPoint) {
        System.out.println("[AFTER_RETURNING] 시스템이 안전하게 종료되었습니다...");
    }

    @AfterThrowing("execution(public void aop.Boy.run(String[], int))")
    public void afterGameException(JoinPoint joinPoint) {
        System.out.println("[AFTER_THROWING] 윈도우 업데이트를 해야합니다!");
        System.out.println("[AFTER_THROWING] [ABORT] 시스템 종료 취소");
    }

    @Around("execution(public void aop.Boy.run(String[], int))")
    public void aroundGame(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AROUND] start");
        System.out.println("[AROUND] end");
    }
}
