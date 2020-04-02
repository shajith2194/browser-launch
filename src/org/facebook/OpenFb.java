package org.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenFb {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\BrowserLaunch\\drivers\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiAwKfQ4snoAhWzwTgGHcQcB3IQPAgH");
	
}
}
