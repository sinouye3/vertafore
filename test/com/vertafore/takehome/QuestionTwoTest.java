package com.vertafore.takehome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTwoTest {


    @Test
    void abbreviate2Letters() {
        assertEquals("a0n", QuestionTwo.abbreviate("an"));
    }


    @Test
    void abbreviateNormal() {
        assertEquals("a11y", QuestionTwo.abbreviate("accessibility"));
        assertEquals("l10n", QuestionTwo.abbreviate("localization"));
    }
}