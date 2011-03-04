package bg.framework.app.functional.page;

import bg.framework.common.functional.*;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasePage {

    protected UIDriver uiDriver;
    public UIOperation webPage;

    public Verify verify = new Verify();

	public final String HOME_PAGE_WINDOW_TITLE = "BritishGas";

	protected MessageVerification messageVerification;

	public BasePage() {
        UIDriver uiDriver = WebDriverProvider.getCurrentDriver();
        webPage = new UIOperation(uiDriver);
        messageVerification =  new MessageVerification(uiDriver);
        verifyPageHasNoErrors();
	}

	private void verifyPageHasNoErrors() {
//		List<String> errorMessages = ErrorLabels.CRITICAL_ERROR_MESSAGES;
//		for (String error : errorMessages) {
//			messageVerification.failIfMessageExists(error);
//		}
	}
}
