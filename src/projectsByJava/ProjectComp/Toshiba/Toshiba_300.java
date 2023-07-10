package projectsByJava.ProjectComp.Toshiba;

import projectsByJava.ProjectComp.Toshiba.Toshiba;

public class Toshiba_300 extends Toshiba {

        public Toshiba_300(String name) {
                super(name);
        }

        @Override
        public void connect() {
                print("Я - модель тошиба. Подключился...");
        }
}
