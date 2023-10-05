package psvm_code;

import jdk.dynalink.beans.StaticClass;

public class House {
    public static void main(String[] args) {
        StaticClass.staticMethod();
        System.out.println("static field view: " + StaticClass.staticField);
    }

    static class StaticClass {
        static int staticField = 10;

        static void staticMethod() {
            System.out.println("This is a static method in StacticClass");
        }
    }
}


