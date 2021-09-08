public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.center.y = center.y + center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y = center.y - center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x = center.x - center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x = center.x + center.xSpeed;
    }
}
