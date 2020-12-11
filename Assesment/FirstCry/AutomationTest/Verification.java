package Assesment.FirstCry.AutomationTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Verification {
    WebDriver driver;
    public Verification(WebDriver driver){
        this.driver = driver;
    }
    public void openProductPage(){
        By selectItem = By.xpath("//img[@title='Tuskey Suede Lace Up Shoe - Brown']");
        WebElement openProduct = driver.findElement(selectItem);
        openProduct.click();

    }
    public void costVerification()
    {
        By cost = By.xpath("//*[@id='prod_price']");
        WebElement costEle = driver.findElement(cost);
        String actualCost = (costEle.getText());
        By price= By.xpath("//*[@id='productlist']/div[1]/div[3]/div[2]/span");
        WebElement priceEle = driver.findElement(price);
        String actualPrice = (priceEle.getText());
        Assert.assertEquals(actualCost,actualPrice);
    }
    public void nameVerification()
    {
        By name = By.xpath("//*[@id='prod_name']");
        WebElement nameEle = driver.findElement(name);
        String actualName = (nameEle.getText());
        By names = By.xpath("//*[@id='productList']/div/div[2]/span/pro3016036");
        WebElement namesEle = driver.findElement(names);
        String actualNames = (namesEle.getText());
        Assert.assertEquals(actualName,actualNames);

    }
}

