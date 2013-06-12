package com.test.meter;

/**
 * Created with IntelliJ IDEA.
 * User: lisa
 * Date: 6/12/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {

    private int length;

    public Meter(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return length + "m";
    }
}
