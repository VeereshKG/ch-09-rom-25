package com.xworkz.judgeapp.impl;

import com.xworkz.judgeapp.highcourt.HighCourtJudge;

public class JudgeImpl implements HighCourtJudge {
    @Override
    public void hearCase() { System.out.println("Judge hearing the case"); }
    @Override
    public void analyzeEvidence() { System.out.println("Judge analyzing evidence"); }
    @Override
    public void deliverJudgment() { System.out.println("Judge delivering judgment"); }
}
