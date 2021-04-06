package com.moodanalysis;

public class MoodAnalyser {

    public String moodAnalysis(String message) {

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
        }
}
