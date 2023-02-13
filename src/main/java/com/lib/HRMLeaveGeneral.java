package com.lib;

import org.openqa.selenium.By;

public class HRMLeaveGeneral extends DriverBase implements HrmLeaveVariables {
    public void addLeave() throws InterruptedException {
        driver.findElement(By.xpath(leave_xPath)).click();
        driver.findElement(By.xpath(fromData_xPath)).click();
        driver.findElement(By.xpath(fromDateToday_xPath)).click();
        driver.findElement(By.xpath(toDate_xPath)).click();
        driver.findElement(By.xpath(toDateSelection_xPath)).click();
    }
}
