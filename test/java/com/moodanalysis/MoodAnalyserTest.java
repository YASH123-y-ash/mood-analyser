package com.moodanalysis;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {



    @Test
    public void givenNullMood_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("HAPPY",mood);
    }
}
