package bg.framework.common.functional;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListenerAdapter implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {}

}
