public class RightDirectionChange implements DirectionChange {
    private Direction currentDirection;

    public RightDirectionChange(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    @Override
    public Direction changeDirection() {
        switch (currentDirection) {
            case N:
                return Direction.E;
            case S:
                return Direction.W;
            case E:
                return Direction.S;
            case W:
                return Direction.N;
            default:
                return currentDirection;
        }
    }
}