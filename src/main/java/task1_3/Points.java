package task1_3;

public class Points {
    private Points() {
    }

    public static Point sum(Point var1, Point var2) {
        return new Point(var1.x + var2.x, var1.y + var2.y, var1.z + var2.z);
    }

    public static Point subtract(Point var1, Point var2) {
        return new Point(var1.x - var2.x, var1.y - var2.y, var1.z - var2.z);
    }

    public static Point multiply(Point var1, Point var2) {
        return new Point(var1.x * var2.x, var1.y * var2.y, var1.z * var2.z);
    }

    public static Point divide(Point var1, Point var2) {
        return new Point(var1.x / var2.x, var1.y / var2.y, var1.z / var2.z);
    }

    public static Point enlarge(Point variable, double n) {
        return new Point(variable.x * n, variable.y * n, variable.z * n);
    }
}
