package bg.framework.app.functional.test;

import bg.framework.common.functional.UIDriver;
import bg.framework.common.functional.UIOperation;
import bg.framework.common.functional.WebDriverProvider;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBase {

    UIOperation action;
	@BeforeMethod(alwaysRun = true)
	public void setUp(Method method) throws InterruptedException {
			Reporter.log("Test Name: " + method.getName());
            UIDriver uiDriver = WebDriverProvider.getCurrentDriver();
			uiDriver.get("http://www.britishgas.co.uk");
            action = new UIOperation(uiDriver);
	}


	@AfterSuite(alwaysRun = true)
	public void tearDown(Method method) {
		try {
			Reporter.log("----------------------------------------------------  ");
			WebDriverProvider.quitDriver();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error closing webdriver session." + e.getMessage(), e);
		}
	}
}
