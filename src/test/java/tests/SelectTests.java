package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SelectTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.select().selectItemWidgets();
        app.select().clickSelectMenu();

    }

    @Test
    public void oldStyleSelectMenu(){
        app.select().selectColor("Red");
        app.select().pause(2000);
        app.select().selectColor("Green");
        app.select().pause(2000);
        app.select().selectColor("Blue");
        app.select().pause(2000);
        app.select().selectColor("Red");

    }

    @Test
    public void standardMultiSelectTest(){
        app.select().multiSelectCar("volvo,saab,opel");
    }

    @Test
    public void selectOneTest(){
        app.select().selectOption("Mrs.","selectOne");
        app.select().pause(2000);
        app.select().selectOption("Mr.","selectOne");
        app.select().pause(2000);
        app.select().selectOption("Dr.","selectOne");
    }

    @Test
    public void selectValueTest(){
        app.select().selectOption("Group 1, option 1","withOptGroup");
        app.select().pause(2000);
        app.select().selectOption("Group 1, option 1","withOptGroup");
        app.select().pause(2000);
        app.select().selectOption("Group 2, option 1","withOptGroup");
    }
   // @Test
    public void  multiselectDropDown(){
        app.select().selectOption("Green","react-select-4-input");
        app.select().pause(2000);
        app.select().selectOption("Red","react-select-4-input");
        app.select().pause(2000);
        app.select().selectOption("Black","react-select-4-input");
    }
}
