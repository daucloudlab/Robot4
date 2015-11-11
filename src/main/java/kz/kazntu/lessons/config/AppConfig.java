package kz.kazntu.lessons.config;

import kz.kazntu.lessons.interfaces.Hand;
import kz.kazntu.lessons.interfaces.Head;
import kz.kazntu.lessons.interfaces.Leg;
import kz.kazntu.lessons.models.Robot;
import kz.kazntu.lessons.models.sony.SonyHand;
import kz.kazntu.lessons.models.sony.SonyHead;
import kz.kazntu.lessons.models.toshiba.ToshibaLeg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daulet on 11/11/15.
 */
@Configuration
public class AppConfig {

    @Bean(name = "sonyHand")
    public SonyHand createSonyHand(){
        SonyHand sonyHand = new SonyHand() ;
        return sonyHand ;
    }

    @Bean(name = "sonyHead")
    public SonyHead createSonyHead(){
        SonyHead sonyHead = new SonyHead() ;
        return sonyHead ;
    }

    @Bean(name = "toshibaLeg")
    public ToshibaLeg createToshibaLeg(){
        return new ToshibaLeg() ;
    }

    @Bean(name = "robot")
    public Robot createRobot(){
        Hand hand = createSonyHand() ;
        Head head = createSonyHead() ;
        Leg leg = createToshibaLeg() ;
        Robot r = new Robot(hand, leg,  head) ;
        return r ;
    }

}
