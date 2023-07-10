package projectsByJava.ProjectComp.Computer;

import projectsByJava.ProjectComp.Computer.Computer;

public class Notebook extends Computer {
    public Notebook (String name) {
        super(name);
    }

    public Notebook() {

    }

    public void charge () {
        print("Я - ноутбук. Я заряжаюсь.");
    }


    @Override
    public void on () {
        /*
        super.on();
         */
        print("I - Noteboock!!! I turned on. My model: " + getName());
    }

    @Override
    public void connect() {
        print("Я - ноутбук");
    }
}
