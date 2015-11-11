package kz.kazntu.lessons.start;


import kz.kazntu.lessons.config.AppConfig;
import kz.kazntu.lessons.models.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class) ;

        Robot robot = (Robot)context.getBean("robot") ;
        robot.action();
    }
}
