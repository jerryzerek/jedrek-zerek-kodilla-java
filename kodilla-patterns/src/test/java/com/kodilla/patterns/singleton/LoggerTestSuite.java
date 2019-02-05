package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void getLogs() {
        Logger.getInstance().log("yesterday");
    }

    @Test
    public void testLogger() {
        String logs = Logger.getInstance().getLastLog();

        Assert.assertEquals("yesterday", logs);
    }


}
