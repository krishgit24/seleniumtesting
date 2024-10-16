package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GoogleSearchTest extends TestCase {
    public GoogleSearchTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(GoogleSearchTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
