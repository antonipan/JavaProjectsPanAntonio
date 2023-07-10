package projectsByJava.ProjectComp.Asus;

import projectsByJava.ProjectComp.Computer.Notebook;

public class Asus extends Notebook {
    protected Asus (String name) {
        super(name);
    }

    @Override
    public void connect() {
        print("Я - Асус");
    }
}
