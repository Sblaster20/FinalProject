import javax.swing.ImageIcon;

public class Fireball extends GameObject {

    
    private int dx;
    private int dy;
    

    public Fireball(int x, int y, int direction) {
        super(x, y);
        this.setSize(17, 18);
                this.setIcon(new ImageIcon("./images/fireball/blue_fireball_up.png"));
                dx = 0;
                dy = -20;

             
        
        }
    

    /**
     * update the character's location and image based on the dx and dy
     * Step 1: What i did was make sure that everytime this person reaches the edge, he goes back by Dx or Dy, negating the future dx/dy movement
     */


    public void update() 
    {
        this.setLocation(this.getX() + dx, this.getY() + dy);

    }

    
    
}