package com.xworkz.trackerapp;

import com.xworkz.trackerapp.tracker.Tracker;
import com.xworkz.trackerapp.tracker.impl.TrackerImpl;

public class TrackerRunner {
    public static void main(String[] args) {
        Tracker tracker = new TrackerImpl();
        tracker.trackSteps();
        tracker.trackHeartRate();
    }
}
