package bg.framework.common.control;

import bg.framework.common.functional.UIDriver;
import bg.framework.common.functional.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class UIControl {

protected UIDriver webdriver;
	protected String value;
	protected String locator;
	protected WebElement webElement;

	public UIControl(WebElement webElement) {
		this.webElement = webElement;
		webdriver = WebDriverProvider.getCurrentDriver();
	}

	public String getValue(){
		return webElement.getText();
	}

	public abstract void setValue(String value) ;

    public void clearValue(){
        webElement.clear();
    }

	public List<WebElement> getOptions() {
		List<WebElement> options = webElement.findElements(By.tagName("option"));
		return options;
//			throw new UnsupportedOperationException("Doesn't have options support for control of type :" + this.getClass().getCanonicalName());
	}

    public void sendKeys(Keys key){
        webElement.sendKeys(key);
    }


}
