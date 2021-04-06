package com.moodanalysis;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message) {
        super();
        this.message = message;
    }

    public String moodAnalysis() {
        try {


        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
        catch (NullPointerException e)
        {
            return "HAPPY";
        }
}
}
