package com.hackhook.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * SampleService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 1, 2017</pre>
 */
public class SampleServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sayNum(int x, int y)
     */
    @Test
    public void testSayNum() throws Exception {
        SampleService sampleService = new SampleService();
        assertEquals("10 + 11 = ?", 21, sampleService.sayNum(10, 11));
        assertEquals("10 + 11 = ?", 21, sampleService.sayNum(-10, 11));
    }
}