package sk.bsmk.bdd.todo;

import com.codeborne.selenide.CollectionCondition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sk.bsmk.bdd.pages.TodoPage;

/**
 * Created by bsmk on 6/20/14.
 */
public class TodoStepDefs {

  @Given("^User is on todo page$")
  public void userIsOnTodoPage() {
    TodoPage.open();
  }

  @Given("^There are no todos$")
  public void thereAreNoTodos() {
    if (TodoPage.getAllTodos().size() > 0) {
      TodoPage.clickToggleAll();
      TodoPage.clickClearCompleted();
    }
  }

  @When("^User adds (.+) to todos$")
  public void userAddsToTodos(String todo) {
    TodoPage.addNewTodo(todo);
  }

  @Then("Items count is (\\d+)")
  public void thereIsItem(int count) {
    TodoPage.getAllTodos().shouldBe(CollectionCondition.size(count));
  }
}
