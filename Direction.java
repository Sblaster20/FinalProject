/**
 * This class is intended to make handling
 * direction consistent across classes
 */

public class Direction {
    public static final int NORTH = 0;
    public static final int NORTHEAST= 1;
    public static final int EAST = 2;
    public static final int SOUTHEAST = 3;
    public static final int SOUTH = 4;
    public static final int SOUTHWEST = 5;
    public static final int WEST = 6;
    public static final int NORTHWEST = 7;

    private int direction;

    public Direction(int direction) {
        if (direction < 0 || direction > 7) {
            throw new IllegalArgumentException("direction must be in range 0 to 3");
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
