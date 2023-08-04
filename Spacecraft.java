public class Spacecraft {
    private Point currentPosition;
    private Direction currentDirection;

    public Spacecraft(Point initialPoint, Direction initialDirection) {
        currentPosition = initialPoint;
        currentDirection = initialDirection;
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
                default:
                    System.out.println("Invalid command: " + command);
                    break;
            }
        }
    }

    public Point getFinalPosition() {
        return currentPosition;
    }

    public Direction getFinalDirection() {
        return currentDirection;
    }

    private void moveForward() {
        Movement movement = new ForwardMovement(currentPosition, currentDirection);
        currentPosition = movement.move();
    }

    private void moveBackward() {
        Movement movement = new BackwardMovement(currentPosition, currentDirection);
        currentPosition = movement.move();
    }

    private void turnLeft() {
        DirectionChange directionChange = new LeftDirectionChange(currentDirection);
        currentDirection = directionChange.changeDirection();
    }

    private void turnRight() {
        DirectionChange directionChange = new RightDirectionChange(currentDirection);
        currentDirection = directionChange.changeDirection();
    }

    private void turnUp() {
        DirectionChange directionChange = new UpDirectionChange(currentDirection);
        currentDirection = directionChange.changeDirection();
    }

    private void turnDown() {
        DirectionChange directionChange = new DownDirectionChange(currentDirection);
        currentDirection = directionChange.changeDirection();
    }
}
