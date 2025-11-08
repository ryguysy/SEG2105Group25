package com.example.mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.script.ScriptException;

public class EvaluateTest {

    @Test
    public void evaluate_addition() throws ScriptException {

        Evaluate e = new Evaluate();
        double actual = e.evaluate("1+1").doubleValue();
        double expected = 2.0;
        assertEquals(expected, actual, 0.0);


    }
}