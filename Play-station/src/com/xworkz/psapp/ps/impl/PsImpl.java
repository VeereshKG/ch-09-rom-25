package com.xworkz.psapp.ps.impl;

import com.xworkz.psapp.ps.Ps;

public class PsImpl implements Ps {
    public void startGame() {
    System.out.println("Starting game");
}

    @Override
    public void saveGame() {
        System.out.println("Game saved");
    }

    @Override
    public void quitGame() {
        System.out.println("Game exited");
    }

}
