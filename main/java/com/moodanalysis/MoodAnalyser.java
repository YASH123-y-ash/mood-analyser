package com.moodanalysis;

public class MoodAnalyser {

    String message;

    //taking default constructor
    public MoodAnalyser()
    {

    }
    //taking parameterized constructor
    public MoodAnalyser(String message)
    {
        super();
        this.message = message;
    }



    //UC1-taking parameters in method
    public String moodAnalysis(String message) {

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
        }
    //UC2-defining a method without parameter
    public String mooAnalysis()
    {
        if(this.message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
