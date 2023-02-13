package com.lib;

import org.openqa.selenium.By;

public class HRMLeaveGeneral extends DriverBase implements HrmLeaveVariables {
    public void addLeave() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(leave_xPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(fromData_xPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(fromDateToday_xPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(toDate_xPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(toDateSelection_xPath)).click();
    }
}
