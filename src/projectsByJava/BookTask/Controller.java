package projectsByJava.BookTask;

import projectsByJava.BookTask.Model.BaseTask;
import projectsByJava.BookTask.Model.Calendary;
import projectsByJava.BookTask.Model.HomeTask;
import projectsByJava.BookTask.Model.WorkTask;

import java.util.Scanner;

public class Controller {
    BaseTask homeTask = new HomeTask();
    BaseTask workTask = new WorkTask();
    Calendary calendary = new Calendary<>();

    public void getController (int a, int b) {
        if (b == 1) {
            switch (a) {
                case 1 -> doMenu1(homeTask);
                case 2 -> doMenu2(homeTask);
                case 3 -> doMenu3(homeTask);
                case 4 -> doMenu4(homeTask);
                default -> {
                }
            }
        } else if (b == 2) {
            switch (a) {
                case 1 -> doMenu1(workTask);
                case 2 -> doMenu2(workTask);
                case 3 -> doMenu3(workTask);
                case 4 -> doMenu4(workTask);
                default -> {
                }
            }
        }
    }
    public void doMenu1 (BaseTask task) {
        task.addTask();
        calendary.addTask(task);
    }
    public void doMenu2 (BaseTask task) {
        task.readTask();
    }
    public void doMenu3 (BaseTask task) {
        task.deleteTask();
    }
    public void doMenu4 (BaseTask task) {
        task.watchTask();
        System.out.println(calendary.toString());
    }

}

