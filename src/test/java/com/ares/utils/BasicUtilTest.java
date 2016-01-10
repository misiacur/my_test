package com.ares.utils;

import com.ares.controllers.SimpleController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Misiek on 2016-01-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SimpleController.class)
public class BasicUtilTest {

    private BasicUtil util;

    @Before
    public void setUp() throws Exception {
        this.util = new BasicUtil();
    }

    @Test
    public void testShowName() throws Exception {
        Assert.assertEquals("Name: Misiek", this.util.showName("Misiek"));
    }
}