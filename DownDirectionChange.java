public class DownDirectionChange implements DirectionChange {
    private Direction currentDirection;

    public DownDirectionChange(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    @Override
    public Direction changeDirection() {
        if (currentDirection == Direction.Down)
            return Direction.Down;
        else
            return Direction.Down;
    }
}