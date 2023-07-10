package projectsByJava.ProjectComp.Build;

public class CDrom {

    private String name;
    private double speedWrite;
    private boolean cdWritable;

    public String getName() {
        return name;
    }

    public double getSpeedWrite() {
        return speedWrite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeedWrite(double speedWrite) {
        this.speedWrite = speedWrite;
    }

    public boolean isCdWritable() {
        return cdWritable;
    }

    public void setCdWritable(boolean cdWritable) {
        this.cdWritable = cdWritable;
    }

    public void writeCD () {
        System.out.println("Write CD");
    }

    public void openCD () {
        System.out.println("Open CD");
    }

    public void closeCD () {
        System.out.println("CD is closed");
    }
    public void readCD () {
        System.out.println("CD is reading");
    }
}
