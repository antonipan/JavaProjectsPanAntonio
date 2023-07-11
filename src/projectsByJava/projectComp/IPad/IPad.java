package projectsByJava.projectComp.IPad;

import projectsByJava.projectComp.Computer.Planshet;

public class IPad extends Planshet {
    @Override
    public void on() {
        print("I - IPad! I load up. My amount of memory.: " + getRam());
        print("I - IPad! I turned on. My model: " + getName());
    }

    @Override
    public void load() {
        print("I - IPad! I load up. My amount of memory.: " + getRam());
    }

    @Override
    public void off() {
        print("IPad switched off. " + getName());
    }
}
