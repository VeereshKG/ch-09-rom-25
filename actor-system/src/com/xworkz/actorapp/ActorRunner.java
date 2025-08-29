package com.xworkz.actorapp;

import com.xworkz.actorapp.actor.Actor;
import com.xworkz.actorapp.visnuvardhan.VishnuVardhana;

public class ActorRunner {

    public static void main(String[] args) {
        System.out.println("main Started");

        Actor actor  = new VishnuVardhana();

        actor.doActing();

        System.out.println("main ended");
    }
}
