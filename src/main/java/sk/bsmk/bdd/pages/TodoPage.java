package sk.bsmk.bdd.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

/**
 * Created by bsmk on 6/20/14.
 */
public final class TodoPage {

  private TodoPage() {}

  public static void open() {
    Selenide.open("http://todomvc.com/architecture-examples/emberjs/");
  }

  public static void clickToggleAll() {
    Selenide.$("#toggle-all").click();
  }

  public static void clickClearCopleted() {
    Selenide.$("#clear-completed").click();
  }

  public static void addNewTodo(String todo) {
    Selenide.$("#new-todo").setValue(todo).pressEnter();
  }

  public static ElementsCollection getAllTodos() {
    return Selenide.$$("#todo-list li");
  }

}
