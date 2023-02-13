package com.lib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public interface HrmGlobal {
    public String url = "https://opensource-demo.orangehrmlive.com/";
    public String username_xPath = "//input[@name='username']";
    public String password_xPath = "//input[@name='password']";
    public String dropDown = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
    public String logout_xPath = "Logout";

}


