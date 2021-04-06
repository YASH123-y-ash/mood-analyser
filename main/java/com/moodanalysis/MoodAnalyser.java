package com.moodanalysis;

public class MoodAnalyser {

    private String message;

    public void MoodAnalyzer(String message) {
        this.message = message;

    }

    public MoodAnalyser() {

    }


    // Handeling NullPointerException
    public String analyseMood(String message)  {
        try {
            this.message = message;
            if (message == null || message.isEmpty())
            {
                throw new MoodAnalyserException();
            }
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";

        } catch (MoodAnalyserException e) {
            return "HAPPY";

        }

    }
}