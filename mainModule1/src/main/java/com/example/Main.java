package com.example;

import com.example.subModule.SubMain;
import com.example.subMultiModule1.LibClass;

import java.io.BufferedWriter;
import java.io.File;

/**
 * lorem ipsum sit dor tass
 */
public class Main {

    /**
     * documented field.
     */
    public Object memberObj = new Object();

    public Integer memberInt = 4;

    /**
     * public constructor with 3 args
     *
     * @param a int parameter
     * @param b char parameter
     * @param c boxed float parameter
     */
    public Main(int a, char b, Float c) {
        System.out.printf("%d %c %f", a, b, c);
    }

    /**
     * Documented function
     *
     * @param args adb, ddhdhfwdfe
     */
    public static void main(String[] args) {
        System.out.println("test");

        // Should be detected by SpotBugs.
        Number[] arr = new Integer[10];

        // Should be detected by SpotBugs.
        arr[2] = 2;
        arr[3] = abc(args.length, arr[2].intValue(), 3);

        File a = new File("/tmp/abc");
        BufferedWriter b = null;

        if (a == new File("/")) System.out.println("root"); // want: `==` operator must be replaced with `.equals`

        try {
            b = java.nio.file.Files.newBufferedWriter(a.toPath());
            b.write(34);
        } catch (Throwable ignored) {
            ignored.printStackTrace();
        }

        LibClass lc = new LibClass();

        System.out.println(lc.strProp);

        SubMain sm = new SubMain();


        for (Number i : arr)
            System.out.println(i);
    }

    public static int abc(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * void method with no args
     */
    private void method1() {
        System.out.println("output");
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() != o.hashCode();
    }
}


