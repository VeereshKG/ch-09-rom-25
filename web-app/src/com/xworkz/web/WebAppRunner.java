package com.xworkz.web;

import com.xworkz.web.webapp.WebApp;
import com.xworkz.web.webapp.impl.WebAppImpl;

public class WebAppRunner {
    public static void main(String[] args) {
        WebApp webApp = new WebAppImpl();
        webApp.startServer();
        webApp.deployApp();
        webApp.stopServer();
    }
}
