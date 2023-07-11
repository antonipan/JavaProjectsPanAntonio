package projectsByJava.projectComp.Build;

public class Hdd {
    private int size;

    public Hdd(int size) {
        this.size = size;
    }
    public Hdd() {
        this(100);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void writerHdd () {
        System.out.println("I write on HDD");
    }
    public void readerHdd () {
        System.out.println("I read on HDD");
    }
    public void cleanerHdd () {
        System.out.println("I clean HDD");
    }
    public void dividerHdd () {
        System.out.println("I divide HDD on an area");
    }
}
