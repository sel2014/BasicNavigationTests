package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NavigationsTests_Firefox {

    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();


        //1. Open	browser
        //2. Go	to	website	https://google.com

        driver.get("https://google.com");


        WebElement cookiesButton = driver.findElement(By.xpath("//div[.= 'Accept all']"));
        cookiesButton.click();

        //3. Save the	title in	a	string	variable

        String googleTitle1 = driver.getTitle();



        //4. Go	to	https://etsy.com

        driver.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable



        WebElement cookiesButtonEtsy = driver.findElement(By.xpath("//button[@class='" +
                "wt-btn wt-btn--filled " + "wt-mb-xs-0']"));
        cookiesButtonEtsy.click();

        String etsyTitle1 = driver.getTitle();


        //6. Navigate	back	to	previous page

        driver.navigate().back();
        //7. Verify	that	title	is	same	is	in	step	3
        String googleTitle2 = driver.getTitle();
        System.out.println("googleTitle1 = " + googleTitle1);
        System.out.println("googleTitle2 = " + googleTitle2);

        StringUtility.verifyEquals(googleTitle1, googleTitle2);


        //8. Navigate	forward	to	previous	page

        driver.navigate().forward();

        String etsyTitle2 = driver.getTitle();
        System.out.println("etsyTitle1 = " + etsyTitle1);
        System.out.println("etsyTitle2 = " + etsyTitle2);
        //9. Verify	that	title	is	same	is	in	step	5

        StringUtility.verifyEquals(etsyTitle1, etsyTitle2);







    }
}
