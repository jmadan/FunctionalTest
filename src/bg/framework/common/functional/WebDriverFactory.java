package bg.framework.common.functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebDriverFactory {

    public enum browserType{
		iehta,
		firefox,
		chrome,
		headless
	}

	public WebDriver getDriver(browserType browsertype) {
		switch(browsertype){
		case iehta:
			return new InternetExplorerDriver();
		case firefox:
			return new FirefoxDriver();
		case chrome:
			return new ChromeDriver();
		case headless:
            HtmlUnitDriver driver = new HtmlUnitDriver();
            driver.setJavascriptEnabled(true);
			return driver;
		default:
			return new FirefoxDriver();
		}

	}
}
