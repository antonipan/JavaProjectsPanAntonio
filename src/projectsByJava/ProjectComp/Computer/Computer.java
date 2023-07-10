package projectsByJava.ProjectComp.Computer;

import projectsByJava.ProjectComp.Build.CDrom;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private CDrom cDrom = new CDrom();

    // construcntor
    public Computer (String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public Computer(String name) {
        this(name, 0);
    }

    public Computer () {
        this("compics");
//        System.out.println("Constructor: ccompucter...");
    }

    // beehive
    public void on () {print("I turned on. My model: " + getName());
    }
    public void load () {
        print("I load up. My amount of memory.: " + getRam());
    }
    public void off () {
        print("I switched off. " + getName());
    }
// Overload
    public void on (Notebook comp) {
        System.out.println("I load for a Work");
    }
    public void restart () {
        print("I restart...");
    }
    public void readCD () {
        print("i read CD");
    }

    public void connect () {
        print("Подключение установлено...");
    }

    protected void print (String str) {
        System.out.println(str);
    }
    private int checking (int num) {
        if (num <= 0) {
            System.out.println("This volume " + num + ". is not available.");
            return 0;
        } else {
            return num;
        }
    }
    // getters
    public String getName () {
        return this.name;
    }
    public int getRam () {
        return this.ram;
    }
    public int getHdd () {
        return this.hdd;
    }
    // setters
    public void setName (String newName) {
        this.name = newName;
    }
    public void setRam (int newRam) {
        this.ram = checking(newRam);
    }
    public void setHdd (int newHdd) {
        this.hdd = checking(newHdd);
    }
    public void setWeight(double newWeigt) {
        this.weight = newWeigt;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", weight=" + weight +
                '}';
    }



}
