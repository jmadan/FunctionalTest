package bg.framework.app.functional.page;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage extends BasePage {


    public void NavigateToProducts(){
        webPage.clickWithLinkText("Products & Services");
    }
}
