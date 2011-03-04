package bg.framework.app.functional.test;

import bg.framework.app.functional.entities.BGUser;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Jasdeep
 * Date: 23/02/11
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePageTest extends TestBase{

    @Test
    public void HomePageTest(){

        new BGUser().NavigateToProducts();
    }
}
