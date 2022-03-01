package com.example.springbootspringdatajpa.logika;

import org.springframework.stereotype.Component;

@Component // alebo @Bean, ale @Component ma v sebe @Bean
public class HelloWorld {
     public HelloWorld(){
         System.out.println("Ahoj");
     }
}
