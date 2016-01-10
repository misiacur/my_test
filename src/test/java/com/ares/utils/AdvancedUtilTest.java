package com.ares.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Misiek on 2016-01-10.
 */
public class AdvancedUtilTest {

    private AdvancedUtil util;

    @Before
    public void setUp() throws Exception {
        this.util = new AdvancedUtil();
    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("FullName Mikel", util.getName("Mikel"));
    }
}