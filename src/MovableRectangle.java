public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean speedIsSame() {
        return (topLeft.xSpeed == bottomRight.xSpeed
                && topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if (speedIsSame()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (speedIsSame()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (speedIsSame()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (speedIsSame()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
