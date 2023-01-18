package com.lib;


import org.openqa.selenium.WebDriver;


public class Global 
{
public String url="https://opensource-demo.orangehrmlive.com/";
public String un="Admin";
public String pwd="admin123";
WebDriver D1;

//Objects


public String txtun="//input[@name='username'";
public String txtpwd="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]";
public String btnlogin="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]";
public String Dropdown="//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]";
public String linkLogout="Logout";


}