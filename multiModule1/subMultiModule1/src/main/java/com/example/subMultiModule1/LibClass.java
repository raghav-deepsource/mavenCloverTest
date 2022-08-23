package com.example.subMultiModule1;

import java.util.Arrays;
import java.util.List;

public class LibClass {
    public String strProp = "libClassProperty";

    public LibClass() {
        List<Integer> list12 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Object[] objarr = list12.toArray();
        Integer[] intArr = list12.toArray(new Integer[0]);
        Integer[] intArr2 = list12.toArray(new Integer[list12.size()]);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                if (true | false)
                    System.out.println("afhsdhf");
            }
        });
        method1(t1);
        t1.run();
    }

    void method1(Runnable r) { System.exit(3); }

}
