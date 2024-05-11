import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * This class will house all game objects which are part of the
 * simulation. You must add several targets which can be
 * hit by fireballs and removed from the game.
 */

public class GamePanel extends JPanel implements ActionListener {

    private BufferedImage background;
    private Hero hero;
    private Fireball fireball;
    private Target target1;
    private Target target2;
    //add a fireball variable

    /**
     * Construct a game panel and initialize the game
     */
    public GamePanel() {
        this.setLayout(null);
        hero = new Hero(100, 100);
        fireball = null;
        URL imageURL = getClass().getResource("./images/background/Space.png");
       


    

    int targetWidth = 10;
    int targetHeight = 10; 
    int randomX1 = (int) (Math.random() * 301) + 100;
    int randomY1 = (int) (Math.random() * 301) + 100;
    target1 = new Target(randomX1, randomY1);

    int randomX2 = (int) (Math.random() * 301) + 100;
    int randomY2 = (int) (Math.random() * 301) + 100;
    target2 = new Target(randomX2, randomY2);
        try {
            background = ImageIO.read(imageURL);
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        

        // Handle key presses. We will set dx/dy for the character
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                switch (code) {
                    
                    case KeyEvent.VK_A:
                        hero.setDy(0);
                        hero.setDx(-5);// moving left
                        hero.setDirection(new Direction(Direction.LEFT));
                        break;
                    case KeyEvent.VK_D:
                        hero.setDy(0);// moving up
                        hero.setDx(5);// horizontal v Vertical mutually exclusive
                        hero.setDirection(new Direction(Direction.RIGHT));
                        break;
                    case KeyEvent.VK_SPACE:
                        if (fireball == null) 
                        {
                            fireball = new Fireball(hero.getX() + (hero.getWidth()/3), hero.getY() + (hero.getHeight()/3), hero.getDirection());
                            add(fireball);
                            fireball.setVisible(true);
                        }
                            
                            break;
                        
                        
                        
                        
                    
                    

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int code = e.getKeyCode();
                switch (code) {
                    
                    case KeyEvent.VK_A:
                        hero.setDx(0);
                        hero.setIdle();
                        break;
                    
                    case KeyEvent.VK_D:
                        hero.setDx(0);
                        hero.setIdle();
                        break;
                }
            }

        });
        

        // create and start the game timer. This gamepanel is passed
        // as the action listener which will be triggered every 17 milliseconds
        Timer gameLoop = new Timer(17, this);
        gameLoop.start();
        this.add(hero);
        this.add(target1);
        this.add(target2);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    // render the gamePanel with the background image
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    // The timer will trigger this method every 17 milliseconds.
    // This is the main game loop and should house the logic for
    // moving everything on the screen and their interactions.
    @Override
    public void actionPerformed(ActionEvent e) {
        hero.update(this.getWidth(), this.getHeight());
        if (target1 != null) 
        {
            target1.update();    
        }
        if (target2 != null)
        {
            target2.update();
        }
        if (fireball != null) {
            fireball.update();
        
            if ((fireball.getX() >= this.getWidth() || fireball.getX() <= 0 - fireball.getWidth()) ||
                (fireball.getY() >= this.getHeight() || fireball.getY() <= 0 - fireball.getHeight())) {
                this.remove(fireball);
                fireball = null;
        
            } else if (target1 != null && fireball.hasCollidedWith(target1) && fireball != null) {
                Rectangle bounds = target1.getBounds();
                this.remove(fireball);
                fireball = null;
                this.repaint(bounds);
                this.remove(target1);
                target1 = null;
        
            } else if (target2 != null && fireball.hasCollidedWith(target2) && fireball != null) {
                Rectangle Bounds = target2.getBounds();
                this.remove(fireball);
                fireball = null;
                this.repaint(Bounds);
                this.remove(target2);
                target2 = null;
                
            }
        }
        
        }

        
        
           

           
    }


