package com.pankova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void success_find_max() {
        Main main = new Main();
        var array = new long [] {1, 2, 3, 10, 4, 5};
        var expectedResult = 10L;
        var actual = main.findMax(array);
        assertEquals(expectedResult, actual);


    }
}