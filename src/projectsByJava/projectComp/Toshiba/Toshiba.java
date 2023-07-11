package projectsByJava.projectComp.Toshiba;

import projectsByJava.projectComp.Computer.Notebook;

public class Toshiba extends Notebook {

    protected Toshiba (String name) {
        super(name);
    }
    public void writeCD () {
        print("I am writing CD... Toshiba");
    }

    @Override
    public void connect() {
        print("Я - тошиба");
    }
}
