package junit_testing;

import java.util.Objects;

public class AirConditioner {

    public boolean isOn(String on) {
        if (Objects.equals(on, "on")) {
            System.out.println("Ac is on");
        }
        return true;
    }

    public boolean isOff(String off) {
        if (off == "off") {
            System.out.println("Ac is off");
        }
        return true;
    }

}








