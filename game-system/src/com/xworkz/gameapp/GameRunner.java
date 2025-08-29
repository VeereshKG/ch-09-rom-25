package com.xworkz.gameapp;

import com.xworkz.gameapp.bgmi.Bgmi;
import com.xworkz.gameapp.game.Game;

public class GameRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Game game = new Bgmi();
        game.type();
        System.out.println("main ended");
    }
}
