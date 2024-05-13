import javax.swing.ImageIcon;

public class LaserBlast extends GameObject {

    private int dy;

    // creates new LaserBlast object
    public LaserBlast(int x, int y) 
    {
        super(x, y);
        this.setSize(17, 18);
                this.setIcon(new ImageIcon("./images/fireball/blue_fireball_up.png"));
                dy = -20
    }

    //updates the LaserBlasts location based on dx
    public void update() 
    {
        this.setLocation(this.getX(), this.getY() + dy);
    }
}
