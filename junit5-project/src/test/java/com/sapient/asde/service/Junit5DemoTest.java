package com.sapient.asde.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

@Tag("smoke test")
public class Junit5DemoTest {
    @ParameterizedTest
    @ValueSource(strings = {"cat","mat","bat","rat"})
    void ofLengthThree(String string){
        assertTrue(string.length()==3);
    }

    @Disabled
    @RepeatedTest(value=5)
    @DisplayName("Repeating Test")
    void customDisplayName(RepetitionInfo repetitionInfo,TestInfo testInfo){
        int i=3;
        assertEquals(repetitionInfo.getCurrentRepetition(),i);
    }


}




