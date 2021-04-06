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

    //UC3-handle exception if user gives invalid mood null
    public String moodAnalysis()
    {
        try {
            if (this.message.contains("sad"))
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
