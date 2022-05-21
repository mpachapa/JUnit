package org.exampleTest;

import org.example.Superhero;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperTest {

    @Test
    void spiderWoman(){
        Superhero spider = new Superhero("Spider-Woman", "Web Spinning");
        assertEquals("Spider-Woman",spider.getName());
        assertEquals("Web Spinning",spider.getPower());
    }
}

