package java_tasks.level_6;

import java.util.*;

import static java_tasks.level_6.Nootbook.*;

public class Main {
    public static void main(String[] args) {
        // #region
        System.out.println("--- Class Worker ---");

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        //#endregion

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));


        System.out.println("--- Class Cat ---");

        Cat cat1 = new Cat();
//        System.out.println(cat.name);
        cat1.name = "Vaska";
//        System.out.println(cat.name);
        cat1.age = 5;
        cat1.ownerName = "Petr";
        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 3;
        cat2.ownerName = "Petr";

        Cat cat3 = new Cat();
        cat3.name = "Barsik";
        cat3.age = 3;
        cat3.ownerName = "Petr";


        Set <Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        System.out.println(cat3.equals(cat2));

        System.out.println("--- Nootbook");



        notbooks = getbooks(100);
        Map <Integer, Integer> filter = new HashMap<>(userFilter());
        found(filter, notbooks);

    }
}