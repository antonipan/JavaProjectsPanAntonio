package projectsByJava.ProjectComp.Startproject;


import projectsByJava.ProjectComp.Computer.Computer;
import projectsByJava.ProjectComp.Computer.Notebook;

public class Main {

    public static void main(String[] args) {

//        Computer comp1 = new Computer("Toshiba", 4);
//        Computer comp2 = new Computer("Sony", 8);
//        comp1.on();
//        comp2.on();
//        comp2 = comp1;
//        comp2.on();
//        Computer computer = new Computer("comp");
//        computer.on();
//        Notebook notebook = new Notebook("cola");
//        notebook.on();
//        notebook.load();
//        notebook.off();

//        Toshiba_300 toshiba_300 = new Toshiba_300();
//        toshiba_300.writeCD();
//        Asus_100 asus_100 = new Asus_100();
//        asus_100.on();

        /*
        Computer computer = new Computer("Igl");
        Notebook notebook = new Notebook("XXXX"):
         */
//        Toshiba_300 toshiba_300 = new Toshiba_300("bifaf");

        /*// Динамическое связывание.
        Computer notebook1 = new Notebook();
        notebook1.on();*/


        /*
        Object notebook = new Notebook();
        notebook.on();
        Переменной доступны только те методы, которые доступны её типу.
         */

//        Computer comp = new Computer("HP");
//        Computer note = new Notebook("Glass");
//        dosame(comp);
//        dosame(note);

//        Computer comp = new Notebook("Toshiba1");
//        Monitor monitor = new Monitor();
//        monitor.connectComp(comp);
        /*
        // Различие поведения ссылочных и примитивных переменных.
        Computer comp1 = new Computer("Test1");
        System.out.println(comp1.getName());
        metod(comp1);
        System.out.println(comp1.getName());
        int age = 10;
        System.out.println(age);
        metodInt(age);
        System.out.println(age);
        */
        Computer comp4 = new Computer();
        Computer comp5 = new Notebook();
        comp4.on(((Notebook) comp5));
        Notebook comp6 = new Notebook();
        comp6.on(comp6);
        

    }

    public static void dosame (Computer comp) {
        if (comp instanceof Notebook) {
            comp.on();
            ((Notebook)comp).charge();
        } else if (comp instanceof Computer) {
            comp.on();
        }
    }

    public static void metod (Computer comp) {
        comp.setName("Test 2");
    }

    public static void metodInt (int age) {
        age = age + 10;
    }
}
