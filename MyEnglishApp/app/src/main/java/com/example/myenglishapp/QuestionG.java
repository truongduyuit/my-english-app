package com.example.myenglishapp;

public class QuestionG { private String ques;
    private String ans_a;
    private String ans_b;
    private String ans_c;
    private String ans_d;
    private String ans_true;

    public QuestionG(String ques, String ans_a, String ans_b, String ans_c, String ans_d, String ans_true) {
        this.ques = ques;
        this.ans_a = ans_a;
        this.ans_b = ans_b;
        this.ans_c = ans_c;
        this.ans_d = ans_d;
        this.ans_true = ans_true;
    }

    public QuestionG(){}

    public String getQues() {
        return ques;
    }

    public String getAns_a() {
        return ans_a;
    }

    public String getAns_b() {
        return ans_b;
    }

    public String getAns_c() {
        return ans_c;
    }

    public String getAns_d() {
        return ans_d;
    }

    public String getAns_true() {
        return ans_true;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setAns_a(String ans_a) {
        this.ans_a = ans_a;
    }

    public void setAns_b(String ans_b) {
        this.ans_b = ans_b;
    }

    public void setAns_c(String ans_c) {
        this.ans_c = ans_c;
    }

    public void setAns_d(String ans_d) {
        this.ans_d = ans_d;
    }

    public void setAns_true(String ans_true) {
        this.ans_true = ans_true;
    }
}
