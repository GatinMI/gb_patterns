package ru.gb.lesson_3.factory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public Chair chair(@Value("chair.type") String type) {
        if (type.equals("vintage")) {
            return new VintageChair();
        } else {
            return new ModernChair();
        }
    }
}
