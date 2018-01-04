package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person boy = context.getBean("boy", Person.class);

        String[] gameName = {"재미있는 게임", "오래한 게임", "즐거운 게임"};
        int playTime = 100;

        boy.run(gameName, playTime);
    }
}
