package Assesment.FirstCry;

import Assesment.FirstCry.AutomationTest.SearchProduct;
import Assesment.FirstCry.AutomationTest.Verification;
import org.testng.annotations.Test;
public class FirstExecutable extends SetupDriver {
    //String username = "standard_user";
    //String password = "secret_sauce";
    String checkboxToBeSelected="Pink";

    @Test
    public void test() {
        SearchProduct product = new SearchProduct(driver);
        product.selectProduct();
        product.selectFilter(checkboxToBeSelected);
        product.testDropDown();
        Verification product1=new Verification(driver);
        product1.costVerification();
        product1.nameVerification();
        product1.openProductPage();



    }
}
