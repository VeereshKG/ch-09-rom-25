package com.xworkz.judgeapp;

import com.xworkz.judgeapp.highcourt.HighCourtJudge;
import com.xworkz.judgeapp.impl.JudgeImpl;

public class HighCourtRunner {

    public static void main(String[] args) {
        HighCourtJudge judge = new JudgeImpl();
        judge.hearCase();
        judge.analyzeEvidence();
        judge.deliverJudgment();
    }
}
