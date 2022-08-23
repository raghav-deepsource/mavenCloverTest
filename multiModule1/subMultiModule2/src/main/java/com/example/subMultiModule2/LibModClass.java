package com.example.subMultiModule2;

import java.util.Random;

public class LibModClass {
    public String sayHello(boolean t) {
        String a = null;
        if (!t) a = "true";
        return a;
    }

    public int compute(int a, int b) {
        return a + b;
    }
}
