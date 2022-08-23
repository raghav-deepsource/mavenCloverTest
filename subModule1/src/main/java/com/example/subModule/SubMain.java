package com.example.subModule;

import com.example.subMultiModule2.LibModClass;

public class SubMain {
    public String doTHing(String thing, String thang) {
        LibModClass a;
        a = new LibModClass();

        if (thing.contains("e") && (a.compute(thing.length(), 4) == (thang.length() - 1) * 2
                || a.compute(thang.length(), 23) > 25)) {
            System.out.println("eee");
            return thing.replace("ee", "t");
        } else if (a.compute(3, 5) > 3) {
            System.out.println("dfjsdlkfjlsdkweiruoiweubmfcsdvbfshdkjfhkswdrhriuweyhtrrwehkfbhdskjgfh");
        }

        else return "sfoiawsurioweuroiweyoiryweioryhweiuor";


        return a.sayHello(thing.length() < 3);
    }
}
