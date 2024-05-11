import java.awt.Rectangle;

import javax.swing.JLabel;

/**
 * this class is an abstract class intended to represent
 * any interactive character or object which we will be
 * able to add to our game.
 * 
 */
public abstract class GameObject extends JLabel {
    public GameObject(int x, int y) {
        this.setLocation(x, y);
    }

    /**
     * 
     * determine if this object has collided with other
     * 
     * @param other GameObject with which we are detecting collision
     * @return true if collision is detected between this and other
     */
    public boolean hasCollidedWith(GameObject other) {
        
        Rectangle rect1 = new Rectangle(this.getBounds());
        Rectangle rect2 = new Rectangle(other.getBounds());
        return rect1.intersects(rect2);

        
    }

    public abstract void update();
}
