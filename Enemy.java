public class Enemy extends GameObject
{
  private int dx;
  private int dy;
  private Direction direction;
  private int numlives;
  private char type;

  private static Enemy[] greens = new Enemy[4];
  private static Enemy[][] reds = new Enemy[8][2];
  private static Enemy [][] blues = new Enemy[10][2];

  public Enemy(int x, int x)
  {
    super(x, y);
    
  }  

//3 different types of enemys, each has dif sprite, they come in as waves of 8 (varied colors) and fly to their spots 
    //Green - two lives, changes to blue/white sprite once hit, 
    //Blue/Yellow - one life, fires laser blasts
    //Red/white - one life, fires laser blasts
//five total rows of enemies
  //first(top) row of enemies is green, max of 4 across
  //second and third rows are red/white, max of 8 across
  //fouth and fifth rows are blue/yellow, max of 10 across 
//all enemies in the rows shift one direction at a time once reaching the side, they shift down 

// might split into differnet classes for the enemies 
}

