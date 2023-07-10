package projectsByJava.ProjectComp.Build;

public class Ram {
    private int size;

    public Ram(int size) {
        this.size = size;
    }
    public Ram() {
        this(2);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
