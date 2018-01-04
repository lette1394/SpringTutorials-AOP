package aop;

public class Start {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl();

        boy.run();
        girl.run();
    }
}
