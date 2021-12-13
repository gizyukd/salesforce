package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        boolean isHomePageOpened = loginPage
                .open()
                .login("king.giz-gy4p@force.com" , "SalesForce21")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
    }
}
