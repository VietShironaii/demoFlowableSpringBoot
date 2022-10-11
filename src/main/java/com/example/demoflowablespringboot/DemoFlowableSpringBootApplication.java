package com.example.demoflowablespringboot;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(proxyBeanMethods = false)
public class DemoFlowableSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFlowableSpringBootApplication.class, args);
    }

    @Autowired
    public MyService myService;
    @Bean
    public CommandLineRunner init( MyService myService) {

        return new CommandLineRunner() {
            public void run(String... strings) throws Exception {
                myService.createDemoUsers();
            }
        };
    }
}
