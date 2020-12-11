package Assesment.FirstCry.AutomationTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.By.xpath;


public class SearchProduct {
    WebDriver driver;

    public SearchProduct(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct() {
        By searchMenu = xpath("//div[@class='menu-container']//ul//li[4]//a");
        WebElement addProduct = driver.findElement(searchMenu);
        addProduct.click();
    }

    public void selectFilter(String checkboxToBeSelected) {
        By Filter = By.xpath("span[@class='spn1 chkspan']");
        List<WebElement> checkList = driver.findElements(Filter);
        System.out.println("Number of checkboxes present:");
        System.out.println(checkList.size());
        for (int i = 0; i < checkList.size(); i++) {
            if (checkList.get(i).getAttribute("title").equalsIgnoreCase("checkboxToBeSelected")) {
                checkList.get(i).click();
                break;
            }
        }
    }
   public void testDropDown() {
            By SelectDropdown= By.xpath("//div[@class='sort-select']");
            WebElement selectOption=driver.findElement(SelectDropdown);
            //Select s = new Select(selectOption);
            //s.selectByVisibleText("New Arrivals");
            selectOption.click();

            //Select sel=new Select(selectOption);
            //sel.selectByVisibleText("Price");
            //WebElement firstEle=sel.getFirstSelectedOption();
            //System.out.println("first element is:"+firstEle.getText());
        }
    }



