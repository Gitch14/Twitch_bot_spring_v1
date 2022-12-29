package com.example.twitch_bot_spring_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TwitchBotSpringV1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TwitchBotSpringV1Application.class, args);

        context.close();
    }



}
