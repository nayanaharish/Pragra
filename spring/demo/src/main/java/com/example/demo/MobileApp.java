package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class MobileApp {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Iphone",10000.0);
        Mobile m2 = new Mobile("OnePlus",20000.0);
        Mobile m3 = new Mobile("Samsung",10000.10);
        Mobile m4 = new Mobile("Nokia",100);
        ArrayList <Mobile> mobiles = new ArrayList<>();
        mobiles.add(m1);
        mobiles.add(m2);
        mobiles.add(m3);
        mobiles.add(m4);
        System.out.println("Before Sorting:");
        System.out.println(mobiles);
        Collections.sort(mobiles,new MobileBrandComparator());
        System.out.println("Sorted by Brand:");
        System.out.println(mobiles);
        System.out.println("::::::::::::::::::::::::::::");
        Collections.sort(mobiles,new PriceComaparator());
        System.out.println("Sorted by Price");
        System.out.println(mobiles);

    }
}
