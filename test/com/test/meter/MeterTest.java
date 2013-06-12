package com.test.meter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lisa
 * Date: 6/12/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class MeterTest {
    @Test
    public void returns_a_string_with_units(){

        Meter meter = new Meter(6);

        assertThat(meter.toString(), is("6m"));
    }

}
