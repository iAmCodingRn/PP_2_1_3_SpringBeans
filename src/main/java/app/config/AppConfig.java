package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "dog")
    public Animal getDog() {
        Animal animal1 = new Dog("Wow-wow");
        return animal1;
        //this is the configuration of the Bean "dog" we created
    }

    @Bean(name = "cat")
    public Animal getCat() {
        Animal animal2 = new Cat("Meow-meow");
        return animal2;
    }

    @Bean(name = "time")
    public Timer getTimer() {
        Timer timer = new Timer();
        return timer;
    }

}
