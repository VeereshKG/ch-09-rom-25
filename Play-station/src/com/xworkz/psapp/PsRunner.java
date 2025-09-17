package com.xworkz.psapp;

import com.xworkz.psapp.ps.Ps;
import com.xworkz.psapp.ps.impl.PsImpl;

public class PsRunner {
    public static void main(String[] args) {
        Ps playStation = new PsImpl();
        playStation.startGame();
        playStation.saveGame();
        playStation.quitGame();
    }
}
