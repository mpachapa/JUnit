package org.exampleTest;

import org.example.HelloThere;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class helloThereTest {
    @Test
    void name(){
        String kenobi = "General Kenobi";
        InputStream input = new ByteArrayInputStream(kenobi.getBytes());
        System.setIn(input);

        assertEquals("General Kenobi", HelloThere.getName());
    }

    @Test
    void setName(){
        String obi = "Obi-wan";
        InputStream input = new ByteArrayInputStream(obi.getBytes());
        System.setIn(input);
        HelloThere.setGlobalName();

        assertEquals("Obi-wan", HelloThere.globalName);
    }

}
