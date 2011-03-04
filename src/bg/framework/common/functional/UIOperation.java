package bg.framework.common.functional;

import bg.framework.common.control.ControlProvider;
import bg.framework.common.control.FindElement;
import bg.framework.common.control.UIControl;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class UIOperation {

    protected UIDriver uiDriver;
    protected Verify verify = new Verify();
    private final int ERROR_CODE = -1;

    public UIOperation(UIDriver uiDriver) {
        this.uiDriver = uiDriver;
    }

    public void clickWithLinkText(String linkText) {
        UIControl controlType = new ControlProvider().getControl(new FindElement(linkText, "linkText"));
        controlType.setValue(linkText);
    }

//    public void click(String locator){
//        UIControl controlType = new ControlProvider().getControl(new FindByLinkText(locator));
//        controlType.setValue(locator);
//    }
}
