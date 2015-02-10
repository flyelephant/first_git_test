package com.safeng;

/**
 * Created by fengjigang on 15/2/6.
 */
public class FixBug2 {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("dd");
        return super.clone();
    }
}
