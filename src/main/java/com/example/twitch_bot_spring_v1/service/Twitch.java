package com.example.twitch_bot_spring_v1.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitch extends Thread{

    private final static String CHANEL = "https://www.twitch.tv/g1tch14";

    static {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }
    @Override
    public void run() {

        while (true) {
            try {
                WebDriver t1 = new ChromeDriver();
                WebDriver t2 = new ChromeDriver();
                WebDriver t3 = new ChromeDriver();
                t1.get(CHANEL);
                t2.get(CHANEL);
                t3.get(CHANEL);

                Thread.sleep(90000);
                t1.close();
                t2.close();
                t3.close();

                System.out.println("It`s ok!");
            } catch (InterruptedException e) {
            }
        }

    }
}
