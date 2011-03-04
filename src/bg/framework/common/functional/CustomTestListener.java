package bg.framework.common.functional;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */

import org.testng.IInvokedMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

import java.util.List;

public class CustomTestListener extends TestListenerAdapter {


	public void afterInvocation(IInvokedMethod method, ITestResult result) {

		Reporter.setCurrentTestResult(result);

		if (method.isTestMethod()) {

			List<Throwable> verificationFailures = Verify.getVerificationFailures();

			//if there are verification failures...
			if (verificationFailures.size() > 0) {

				//set the test to failed
				result.setStatus(ITestResult.FAILURE);

				//if there is an assertion failure add it to verificationFailures
				if (result.getThrowable() != null) {
					verificationFailures.add(result.getThrowable());
				}

				int size = verificationFailures.size();
				//if there's only one failure just set that
				if (size == 1) {
					result.setThrowable(verificationFailures.get(0));
				} else {
					//create a failure message with all failures and stack traces (except last failure)
					StringBuffer failureMessage = new StringBuffer("Multiple failures (").append(size).append("):\n\n");
					for (int i = 0; i < size-1; i++) {
						failureMessage.append("Failure ").append(i+1).append(" of ").append(size).append(":\n");
						Throwable t = verificationFailures.get(i);
						String fullStackTrace = Utils.stackTrace(t, false)[1];
						failureMessage.append(fullStackTrace).append("\n\n");
					}

					//final failure
					Throwable last = verificationFailures.get(size-1);
					failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":\n");
					failureMessage.append(last.toString());

					//set merged throwable
					Throwable merged = new Throwable(failureMessage.toString());
					merged.setStackTrace(last.getStackTrace());

					result.setThrowable(merged);
				}
			}
		}
	}

}
