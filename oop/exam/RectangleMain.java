package oop.exam;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();

        rc.x = 10;
        rc.y = 10;

        rc.area();
        rc.perimeter();
        rc.isSquare();

        rc.x = 11;
        rc.y = 10;

        rc.area();
        rc.perimeter();
        rc.isSquare();
    }
}
