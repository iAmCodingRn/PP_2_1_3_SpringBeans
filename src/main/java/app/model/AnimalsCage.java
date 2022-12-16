package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    //here we are connecting AnimalsCage with
    // dog-bean. Qualifier makes sure we work
    //only with one bean .
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        animal.say();
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println(timer.getTime()+"const");
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
