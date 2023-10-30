package ru.mirea.kabo0222;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();

    }

    @Override
    public void moveLeft() {
        center.moveLeft();

    }

    @Override
    public void moveRight() {
        center.moveRight();

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 5, 20, 20);
        MovableCircle circle = new MovableCircle(20, point);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}