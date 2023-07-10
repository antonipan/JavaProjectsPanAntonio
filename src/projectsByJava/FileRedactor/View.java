package projectsByJava.FileRedactor;
import projectsByJava.FileRedactor.Menu.*;


import java.io.IOException;
import java.util.Scanner;

public class View {

    Controller controller = new Controller();
    public void runInterface() {
        while (true) {
            int num = Menu.getMenu();
            switch (num) {
                case 1 -> {
                    MenuCreateFile menuWork = new MenuCreateFile();
                    String name = menuWork.getUserFileName();
                    int format = menuWork.getUserFormatFile();
                    try {
                        controller.FormatCreate(name, format);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 2, 3 -> System.out.println("U-p-s");
            }
            if (num == 0) {
                System.out.println("Работа завершена");
                break;
            }
        }
    }


}
