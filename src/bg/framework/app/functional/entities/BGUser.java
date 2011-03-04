package bg.framework.app.functional.entities;

import bg.framework.app.functional.action.HomePageAction;
import bg.framework.app.functional.action.UserActions;
import bg.framework.app.functional.page.HomePage;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class BGUser implements UserActions{


    public HomePageAction NavigateToProducts() {
        new HomePage().NavigateToProducts();
        return null;
    }
}