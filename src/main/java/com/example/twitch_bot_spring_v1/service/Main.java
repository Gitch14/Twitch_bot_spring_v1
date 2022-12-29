package com.example.twitch_bot_spring_v1.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Main{

    @PostConstruct
    public void runAfterObjectCreated() throws InterruptedException {
        Twitch thread = new Twitch();
            for (int i = 0; i < 8; i++) {

                thread.start();
                Thread.sleep(100000);

            }

    }


}
