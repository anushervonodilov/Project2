package com.Project2;

import com.class25HomeWork.WebDriver;

public interface WebDriver1 {

    void open();
    void close();
    String getTitle();

}

interface RemoteWebDriver extends WebDriver1{

    void navigate();

}

interface TakesScreenShot extends RemoteWebDriver {

    void getScreenShot();

}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Chrome Browser");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Firefox Browser");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari Browser");
    }
}
