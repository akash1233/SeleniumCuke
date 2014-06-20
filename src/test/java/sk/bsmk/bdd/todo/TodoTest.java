package sk.bsmk.bdd.todo;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by bsmk on 6/20/14.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    strict = true,
    features = "src/test/resources/manage_todos.feature"
)
public class TodoTest {

  // TODO gradle has problem to run chromedriver
  //@BeforeClass
  public static void beforeClass() {
    System.setProperty("webdriver.chrome.driver",
        "src/test/resources/drivers/chromedriver");
    WebDriverRunner.setWebDriver(new ChromeDriver());
  }

  //@AfterClass
  public static void afterClass() {
    WebDriverRunner.closeWebDriver();
  }

}
