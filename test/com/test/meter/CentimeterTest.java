package com.test.meter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lisa
 * Date: 6/12/13
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class CentimeterTest {
    @Test
    public void should_return_centimeter_as_a_unit(){
        Centimeter centimeter = new Centimeter(5);

        assertThat(centimeter.toString(), is("5cm"));
    }
}
