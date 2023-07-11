package projectsByJava.projectComp.Computer;

public class Monitor {
    private String name;

    public Monitor () {}
    public Monitor (String name) {
        this.name = name;
    }

    public void connectComp (Computer comp) {
        comp.connect();
    }
}
