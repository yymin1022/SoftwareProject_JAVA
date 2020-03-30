package com.yong.Assignment2;

public class Record {
    String studentName;
    int scoreKorean;
    int scoreMath;
    int scoreEnglish;
    int scoreScience;
    int scoreSum;

    public Record(String NAME, int KOR, int MATH, int ENGLISH, int SCIENCE){
        studentName = NAME;
        scoreKorean = KOR;
        scoreMath = MATH;
        scoreEnglish =ENGLISH;
        scoreScience = SCIENCE;

        scoreSum = scoreKorean + scoreMath + scoreEnglish + scoreScience;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getScoreKorean(){
        return scoreKorean;
    }

    public int getScoreMath(){
        return scoreMath;
    }

    public int getScoreEnglish(){
        return scoreEnglish;
    }

    public int getScoreScience(){
        return scoreScience;
    }

    public int getScoreSum(){
        return scoreSum;
    }
}