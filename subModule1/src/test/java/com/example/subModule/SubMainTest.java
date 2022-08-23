package com.example.subModule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SubMainTest {

    @Test
    /**
     * abc def
     */
    void doTHing() {
        SubMain sm = new SubMain();

        assertEquals("tre", sm.doTHing("eere", "tree"));
        assertEquals("ertww", sm.doTHing("ereeww", "reeew"));

        assertEquals(null, sm.doTHing("", "reeew"));
    }

}
