package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreLabConfig {
    @Bean
    public House house() {return new House();}

    @Bean
    public Window window() {return new Window();}

    @Bean
    public Color color() {return new Color();}
}
