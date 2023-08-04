public class BackwardMovement implements Movement {
    private Point currentPosition;
    private Direction currentDirection;

    public BackwardMovement(Point currentPosition, Direction currentDirection) {
        this.currentPosition = currentPosition;
        this.currentDirection = currentDirection;
    }

    @Override
    public Point move() {
        switch (currentDirection) {
            case N:
                return new Point(currentPosition.getX(), currentPosition.getY() - 1, currentPosition.getZ());
            case S:
                return new Point(currentPosition.getX(), currentPosition.getY() + 1, currentPosition.getZ());
            case E:
                return new Point(currentPosition.getX() - 1, currentPosition.getY(), currentPosition.getZ());
            case W:
                return new Point(currentPosition.getX() + 1, currentPosition.getY(), currentPosition.getZ());
            case Up:
                return new Point(currentPosition.getX(), currentPosition.getY(), currentPosition.getZ() - 1);
            case Down:
                return new Point(currentPosition.getX(), currentPosition.getY(), currentPosition.getZ() + 1);
            default:
                return currentPosition;
        }
    }
}