
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGreeting() {
        String result = App.greet("Abhinav");

        assertEquals(
            "Hello, Abhinav! Welcome to Maven CI/CD.",
            result
        );
    }

    @Test
    public void testGreetingWithAnotherName() {
        String result = App.greet("Java");

        assertEquals(
            "Hello, Java! Welcome to Maven CI/CD.",
            result
        );
    }

    @Test
    public void testGreetingNotNull() {
        assertNotNull(App.greet("Developer"));
    }
}
