package ru.ssau.tk.lamarricane.sandbox.task_1;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point point1 = new Point(8, 9, 6);
        Point point2 = new Point(1, 7, 5);
        Point point3 = new Point(0, 4, 4);
        Point point4 = new Point(2, 2, 2);
        Point point5 = new Point(3, 7, 0);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
