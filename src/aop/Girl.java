package aop;

public class Girl implements Person {
    @Override
    public void run() {
        System.out.println("집에 들어간다");

        try {
            System.out.println("요리를 한다");
        } catch (Exception e) {
            if (e.getMessage().equals("불이야!")) {
                System.out.println("119에 신고");
            }
        } finally {
            System.out.println("불 끄고 잔다");
        }

        System.out.println("집에서 나간다");
    }
}