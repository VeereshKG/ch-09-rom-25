package com.xworkz.lightapp.impl;

import com.xworkz.lightapp.light.Dimmable;

public class LightImpl implements Dimmable {
    @Override
    public void dim() {
         System.out.println("SmartLight is dimmed");
    }

    @Override
    public void brighten() {

                System.out.println("SmartLight is brighten");
            }

            @Override
            public void switchOn () {

                    System.out.println("SmartLight is switchon");
                }
            }

