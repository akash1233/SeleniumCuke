package sk.bsmk.bdd.todo;

import com.codeborne.selenide.Selenide;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by bsmk on 6/20/14.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    strict = true,
    features = "src/test/resources/manage_todos.feature"
)
public class TodoTest {

  @BeforeClass
  public static void beforeClass() {
    System.setProperty("browser", "phantomjs");
    System.setProperty("phantomjs.binary.path", "src/test/resources/drivers/phantomjs-1.9.8-linux-x86_64/bin/phantomjs");
  }

  @AfterClass
  public static void afterClass() {
    Selenide.close();
  }

}
