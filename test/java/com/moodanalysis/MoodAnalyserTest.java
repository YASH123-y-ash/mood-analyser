package com.moodanalysis;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {



    @Test
    //UC1-to validate sad mood should return sad
    public void givenSadMood_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis("i am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    //UC1-to validate i am in any mood should return happy
    public void givenIAmAnyMood_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis("i am in any mood");
        Assertions.assertEquals("HAPPY",mood);
    }

}
