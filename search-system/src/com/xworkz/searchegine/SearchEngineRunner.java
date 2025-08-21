package com.xworkz.searchegine;

import com.xworkz.searchegine.google.GoogleSearchEngine;

public class SearchEngineRunner {
    public static void main(String[] args) {
        System.out.println("main Started");
        GoogleSearchEngine google = new GoogleSearchEngine();
        System.out.println("main ended");
    }
}
