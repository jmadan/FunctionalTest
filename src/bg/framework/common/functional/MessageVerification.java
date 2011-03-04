package bg.framework.common.functional;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;

public class MessageVerification {

	private UIDriver uiDriver;

	protected Verify verify = new Verify();

	public MessageVerification(UIDriver uiDriver) {
		this.uiDriver = uiDriver;
	}

	public void verifyMessage(String message) {
		String htmlSource = uiDriver.getPageSource();

		int firstOccurence = htmlSource.indexOf(message);
		int lastOccurence = htmlSource.lastIndexOf(message);
		if (firstOccurence != lastOccurence || firstOccurence == -1) {
			verify.fail(String.format("Expected one occurance of message [%s]", message));
		}
	}

//	public void verifyMessageCount(String message, int count) {
//		String htmlSource = uiDriver.getPageSource();
//		int charCount = htmlSource.replaceAll("[^"+message+"]", "").length();
////		verify.areEqual(count, charCount);
//	}

	public void verifyMultipleOccuraneOfAMessage(String message) {
		String htmlSource = uiDriver.getPageSource();

		int firstOccurence = htmlSource.indexOf(message);
		int lastOccurence = htmlSource.lastIndexOf(message);
		if (firstOccurence == lastOccurence || lastOccurence == -1) {
			Verify.fail(String.format("Expected more than one occurances of message [%s] ",	message));
		}
	}

	public void verifyMessageNotDisplayed(String message) {
		String htmlSource = uiDriver.getPageSource();

		int firstOccurence = htmlSource.indexOf(message);
		if (firstOccurence != -1) {
			verify.fail(String.format("Message not expected [%s] ", message));
		}
	}

	public void failIfMessageExists(String message) {
		if (uiDriver.getPageSource().contains(message)){
            verify.fail(String.format("Message not expected [%s] ", message));
        }
	}

	public void verifyMultipleMessages(List<String> message){
		for (String error : message) {
			verifyMessage(error);
		}
	}
}

