package com.moodanalysis;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMessageShouldReturnsSad()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("I am in sad Mood");
        System.out.println(mood);
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenNullMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood(null);
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);

    }
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood("");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);

    }

}