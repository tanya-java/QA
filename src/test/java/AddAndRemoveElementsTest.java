import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddAndRemoveElementsTest {

  @Test
  public void addAndRemoveElementTest() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\TeachMeSkills\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

    driver.findElementByXPath("//*[@id=\"content\"]/div/button").click();
    driver.findElementByXPath("//*[@id=\"content\"]/div/button").click();
    driver.findElementByXPath("//*[@id=\"elements\"]/button[2]").click();
    List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
    Assert.assertEquals(element.size(), 1, "Success");
  }

}
