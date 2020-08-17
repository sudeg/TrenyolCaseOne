package CaseOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

    public static void main(String[] args) {
        //write your code here
        System.out.println("hai");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com");
    }

}
