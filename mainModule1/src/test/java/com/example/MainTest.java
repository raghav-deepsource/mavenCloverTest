package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    /**
     * Tests the thing.
     */
    @Test
    void doTHing() {
        Main m = new Main(1, '2', 3.0f);
        Main m2 = new Main(1, '2', 3.0f);

        new Boolean(true);

        assertEquals(m, m2);
    }

}
