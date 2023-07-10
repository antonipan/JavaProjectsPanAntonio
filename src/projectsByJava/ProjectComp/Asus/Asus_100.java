package projectsByJava.ProjectComp.Asus;

public class Asus_100 extends Asus {
    public Asus_100(String name) {
        super(name);
    }

    @Override
    public void connect() {
        print("Я - модель Асуса. Подключился...");
    }
}
