package com.example.springbootspringdatajpa.logika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Vramci MVC je toto ta vrchna vrstva Controller, v strede je ta logika
// a na konci je databaza

@RestController
public class HelloController {

    // Get request nema mat telo, nikdy...
    // odpovet kod 200 je ok...400 je na figu, ale je to chyba v mojom kode
    // kody najdem cez google...500 kody su chyby servera

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
