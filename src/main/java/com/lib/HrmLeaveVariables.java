package com.lib;

public interface HrmLeaveVariables {
    String leave_xPath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']";
    String fromData_xPath = "//*[text()='From Date']//following::input[1]";
    String fromDateToday_xPath = "//div[@class='oxd-date-input-link --today' and text()='Today']";
    String toDate_xPath = "//*[text()='From Date']//following::input[2]";
    String toDateSelection_xPath = "//div[text()='28']";
}
