package com.xworkz.web.webapp.impl;

import com.xworkz.web.webapp.WebApp;

public class WebAppImpl implements WebApp {
    @Override
    public void startServer() {
        System.out.println("Web server started");
    }

    @Override
    public void stopServer() {
        System.out.println("Web server stopped");
    }

    @Override
    public void deployApp() {
        System.out.println("Web application deployed");
    }
}
