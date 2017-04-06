import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ToDoListTest {

  @Test
  public void testToDoListConstructor_withoutArgs() {
    List<String> thingsToDo = new ArrayList<>();
    ToDoList toDoList = new ToDoList();
    assertEquals(toDoList.getList(), thingsToDo);
  }

  @Test
  public void testToDoListConstructor_withOneGivenString() {
    List<String> thingsToDo = new ArrayList<>();
    thingsToDo.add("Buy milk");
    ToDoList toDoList = new ToDoList("Buy milk");
    assertEquals(toDoList.getList(), thingsToDo);
  }

  @Test
  public void testToDoListConstructor_withStringList() {
    List<String> thingsToDo = new ArrayList<>();
    thingsToDo.add("Buy milk");
    thingsToDo.add("Do homework");
    ToDoList toDoList = new ToDoList(thingsToDo);
    assertEquals(toDoList.getList(), thingsToDo);
  }

  @Test
  public void testAddTask() throws Exception {
  }

  @Test
  public void testCheckTask() throws Exception {
  }

  @Test
  public void testRemoveTask() throws Exception {
  }

}