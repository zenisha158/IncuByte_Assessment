public class UpDirectionChange implements DirectionChange {
    private Direction currentDirection;

    public UpDirectionChange(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    @Override
    public Direction changeDirection() {
        if (currentDirection == Direction.Up)
            return Direction.Up;
        else
            return Direction.Up;
    }
}