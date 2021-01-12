package ru.ssau.tk.lamarricane.sandbox.task_1;

public class NamedPoint extends Point {
    private String name;

    NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
