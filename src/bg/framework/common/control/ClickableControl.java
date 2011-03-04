package bg.framework.common.control;

import org.openqa.selenium.WebElement;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClickableControl extends UIControl {

    public ClickableControl(WebElement webElement) {
        super(webElement);
    }


    @Override
    public void setValue(String value) {
        webElement.click();
    }
}
