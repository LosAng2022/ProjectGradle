package ru.my.gradle;

import org.joda.time.LocalTime;

import static ru.my.gradle.HelloInArray.helloGradle;

public class GradleApp {

    public static void main(String[] args) {

               LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        helloGradle();

    }

}
