package com.example.multiplechoiceapp;

public class QuestionLibrary {
    private String questionBank[] = {
            "Where are you studying?",
            "Which programming are you learning in developing mobile app?",
            "What is the highest GPA?",
            "Who is the HOP of BCSI and BITI?",
            "What is the name of INTI IU Library?"
    };

    private String options[][] = {
            {"Inti, Nilai", "Inti, Subang", "Inti, Penang"},
            {"Python", "Java", "Ruby"},
            {"5.0", "4.5", "4.0"},
            {"Dr.Deshinta", "Mrs.Chong Fong Kim", "Dr.Choo"},
            {"Tan Sri Abdul Majid", "Tan Sri Abdullah", "Tan Sri Kasim"}
    };

    private String correct[] = {
            "Inti, Nilai",
            "Java",
            "4.0",
            "Mrs.Chong Fong Kim",
            "Tan Sri Abdul Majid"
    };

    public String getQuestion(int q){
        String ques = questionBank[q];
        return ques;
    }

    public String getOption1(int q){
        String o1 = options[q][0];
        return o1;
    }

    public String getOption2(int q){
        String o2 = options[q][1];
        return o2;
    }

    public String getOption3(int q){
        String o3 = options[q][2];
        return o3;
    }

    public String getAnswer(int q) {
        String ans = correct[q];
        return ans;
    }
}
