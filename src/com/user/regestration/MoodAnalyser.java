package com.user.regestration;

public class MoodAnalyser {

    public String analyseMood(String message){
        try {
            if(message.contains(("sad")))
                return "SAD";
            else
                return "Happy";
        }catch(NullPointerException ex) {
            return "Happy";
        }
    }

    public void validAnalyse() throws MoodAnalysisException {
        try {

        }catch(NullPointerException ex) {
            throw new  MoodAnalysisException("Please enter proper message");
        }
    }
}