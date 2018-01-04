package aop;

public class Girl implements Person {
    @Override
    public void run() {
        System.out.println("요리를 한다");
    }

    @Override
    public void run(String[] games, int playTime) {
        System.out.println("요리를 한다");
    }
}