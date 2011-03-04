package bg.framework.common.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class UIDriver implements WebDriver{

    private WebDriver _webDriver;

    public UIDriver(WebDriver webDriver){
        _webDriver = webDriver;
    }
    public void get(String s) {
        _webDriver.get(s);
    }

    public String getCurrentUrl() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getTitle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<WebElement> findElements(By by) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public WebElement findElement(By by) {
        return _webDriver.findElement(by);  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getPageSource() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void close() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void quit() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Set<String> getWindowHandles() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getWindowHandle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TargetLocator switchTo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Navigation navigate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Options manage() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
