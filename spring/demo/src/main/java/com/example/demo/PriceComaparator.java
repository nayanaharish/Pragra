package com.example.demo;

import java.util.Comparator;

public class PriceComaparator implements Comparator<Mobile> {

    @Override
    public int compare(Mobile o1, Mobile o2) {
        if (o1.price < o2.price)
            return 1 ;
        else return -1;
    }
}
