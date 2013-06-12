package com.test.meter;

/**
 * Created with IntelliJ IDEA.
 * User: lisa
 * Date: 6/12/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Centimeter {
    private final int length;

    public Centimeter(int length) {
        this.length=length;

    }
    @Override
    public String toString(){
        return length+"cm";
    }
}
