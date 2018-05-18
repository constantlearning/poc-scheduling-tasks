package com.example.pocschedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PocSchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocSchedulingTasksApplication.class, args);
    }
}
