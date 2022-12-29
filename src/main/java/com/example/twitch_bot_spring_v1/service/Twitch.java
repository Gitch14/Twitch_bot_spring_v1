package com.example.twitch_bot_spring_v1.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitch extends Thread{

    private final static String CHANEL = "https://www.twitch.tv/g1tch14";
    private final static String IP = "https://whoer.net/ru";

    static {
        System.setProperty("webdriver.chrome.driver","D:\\Twitch_bot_spring_v1\\src\\main\\resources\\chromedriver.exe");
    }
    @Override
    public void run() {

        while (true) {
            try {
                WebDriver t1 = new ChromeDriver();
                WebDriver t2 = new ChromeDriver();
                WebDriver t3 = new ChromeDriver();
                WebDriver t4 = new ChromeDriver();
                WebDriver t5 = new ChromeDriver();
                t1.get(CHANEL);
                t2.get(CHANEL);
                t3.get(CHANEL);
                t4.get(CHANEL);
                t5.get(CHANEL);
                Thread.sleep(3);
                t1.close();
                t2.close();
                t3.close();
                t4.close();
                t5.close();
            } catch (InterruptedException e) {
            }
        }

    }
}
