package seleniumPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AffX4tiIzqnEKRnbL9SncXtQsQDQ4170Q69YpXSJRyatW4R60bVfiSi8rcD5cby3BBFiSmHpI5A-4LVimMIXnyMy9mTeoOTqzRqzgq_jczeAKg&smuh=19360&lh=Ac8IryzDDttjbh7ZjhU");
        //driver.get("https://www.browserstack.com/users/sign_in");


        // Find the element using partial link text and then click on it
//        WebElement element = driver.findElement(By.partialLinkText("Forgot"));
//        element.click();

        // Alternatively, you can use JavascriptExecutor to click on the element
        JavascriptExecutor JsEx= (JavascriptExecutor)driver;
//      WebElement element= (WebElement)JsEx.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='classname';");
        
        //CLICK OPERATION
//      JsEx.executeScript("document.getElementsByName('login')[0].click();");
//        Thread.sleep(5000);
   //  JsEx.executeScript("document.querySelector(\"a[href='/users/password/new']\").click();");
//        Thread.sleep(5000);
      
        //HIGHLIGHTING OPERATION
        //  JsEx.executeScript("document.getElementById('email').style.border='7px yellow solid';");
       // JsEx.executeScript("document.getElementById('email').style.background=' pink ';");
       
        //SCROLL OPERATION
        //JsEx.executeScript("document.getElementById('email').scrollIntoView();\r\n"+ "");
//        JsEx.executeScript("window.scrollBy(0,500);")
       // JsEx.executeScript("window.scrollTo(0,50);");
        //Thread.sleep(5000);
//        driver.close();
    }
}
