package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
   // TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("refrigerator");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(1000);
        driver.get("https://www.amazon.in/Samsung-Direct-Refrigerator-RR19A241BGS-NL/dp/B08SC2ZTDP/ref=sr_1_3?keywords=refrigerator&qid=1655991751&sr=8-3");
       
	}
}
