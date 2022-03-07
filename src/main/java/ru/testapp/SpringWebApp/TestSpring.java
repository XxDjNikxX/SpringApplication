package ru.testapp.SpringWebApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPath = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );

        MusicPlayer player = classPath.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println("Getting from resources: ");
        System.out.println(player.getName() + " | " + player.getVolume());

        classPath.close();
    }
}
