package bg.framework.common.functional;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebDriverProvider {

    private static WebDriverProvider webDriverProvider;
    private static UIDriver uiDriver;

    public static WebDriverProvider instance(){
        if(webDriverProvider==null){
            webDriverProvider = new WebDriverProvider();
        }
        return webDriverProvider;
    }

    public static void makeDriver(){
        uiDriver = new UIDriver(new WebDriverFactory().getDriver(WebDriverFactory.browserType.chrome));
    }

    public static UIDriver getCurrentDriver(){
        if(uiDriver==null){
            makeDriver();
        }
        return uiDriver;
    }

    public static UIDriver getWebDriver(){
        return uiDriver;
    }

    public static void quitDriver(){
        if(uiDriver!=null){
            uiDriver.quit();
            uiDriver = null;
        }
    }
}
