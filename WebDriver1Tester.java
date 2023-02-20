package com.Project2;

import com.class25HomeWork.WebDriver;

public class WebDriver1Tester {
    public static void main(String[] args) {

        WebDriver1[] browsers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};

        for (WebDriver1 browser : browsers) {
            browser.open();
            browser.getTitle();
            browser.close();
        }

    }
}
