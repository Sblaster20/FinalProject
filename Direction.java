/**
 * This class is intended to make handling
 * direction consistent across classes
 */

public class Direction {
    public static final int Up = 0;
    public static final int UpRight= 1;
    public static final int Right = 2;
    public static final int DownRight = 3;
    public static final int Down = 4;
    public static final int DownLeft = 5;
    public static final int Left = 6;
    public static final int UpLeft = 7;

    private int direction;

    public Direction(int direction) {
        if (direction < 0 || direction > 7) {
            throw new IllegalArgumentException("direction must be in range 0 to 7");
        }
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
