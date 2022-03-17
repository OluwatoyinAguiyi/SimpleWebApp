package com.develogical.app;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat; // --> deprecated
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {
    private QueryProcessor queryProcessor;

    @Before
    public void init() {
        queryProcessor = new QueryProcessor();
    }

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void canHandleAnotherTerm() {
        assertThat(queryProcessor.process("another"), containsString("another"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
