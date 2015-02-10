package com.safeng;

/**
 * Created by fengjigang on 15/2/6.
 */
public class FixBug3 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
