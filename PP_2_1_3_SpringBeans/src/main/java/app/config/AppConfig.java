package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name="Dog")
    public Dog getDog() {
        Dog dog = new Dog();
        dog.toString();
        return dog;
    }
    @Bean(name="Cat")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.toString();
        return cat;
    }
    @Bean(name="Timer")
    public Timer getTimer() {
        Timer timer = new Timer();
        timer.getTime();
        return timer;
    }

}
