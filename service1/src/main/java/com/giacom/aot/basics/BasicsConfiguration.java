package com.giacom.aot.basics;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

@Configuration
public class BasicsConfiguration {

    @Bean
    ApplicationListener<ApplicationReadyEvent> readyEventApplicationListener(CustomerRepository repository) {
        return event -> repository.saveAll(
                Stream.of("A", "B", "C").map(name -> new Customer(null, name))
                        .toList()
        ).forEach(System.out::println);
    }

}

