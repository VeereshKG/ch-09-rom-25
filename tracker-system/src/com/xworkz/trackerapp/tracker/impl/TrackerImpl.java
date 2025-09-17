package com.xworkz.trackerapp.tracker.impl;

import com.xworkz.trackerapp.tracker.Tracker;

public class TrackerImpl implements Tracker {
    @Override
    public void trackSteps() {
        System.out.println("Steps tracked successfully");
    }

    @Override
    public void trackHeartRate() {
        System.out.println("Heart rate tracked successfully");
    }
}
