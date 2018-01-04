package aop;

import java.lang.StringBuilder;

public class Boy implements Person {
    @Override
    public void run() {
        System.out.println("게임하기");
    }

    @Override
    public void run(String[] games, int playTime) {
        StringBuilder sb = new StringBuilder();

        sb.append("오늘은 ");
        sb.append(String.join(", ", games));
        sb.append("을 ");
        sb.append(playTime);
        sb.append("시간 동안 해봐야겠다");

        System.out.println(sb.toString());

        throw new RuntimeException("예외발생");
    }
}