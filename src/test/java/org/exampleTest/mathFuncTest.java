package org.exampleTest;

import org.example.mathFunc;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class mathFuncTest {
    mathFunc maths = new mathFunc();

    @Test
    void addInteger(){
        assertEquals(10, maths.addition(4,6));
    }
    @Test
    void subDouble(){
        assertEquals(2.3, maths.subtract(4.0,1.7));
    }
    @Test
    void sumsArr(){
        assertEquals(15, maths.sum(new int[]{1,2,3,4,5}));
    }

    @Test
    void multiplication(){
        assertNotEquals(32, maths.multiply(3,11));
    }
    @Test
    void multiplication2(){
        assertEquals(33, maths.multiply(3,11));
    }


    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Test
    void count11() throws IOException {
        System.setOut(new PrintStream(output));
        maths.countTo11(1);
        String printed = new String(output.toByteArray());
        String[] linesOfOutput = printed.split(System.getProperty("line.separator"));
        assertEquals(11, linesOfOutput.length);

    }
}
