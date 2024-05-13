public Enemy extends GameObject
{
  private int dx;
  private int dy;
  private Direction;
  private Enemy[] greens;
  private Enemy[][] reds;
  private Enemy[][] blue;
  

  public Enemy(int x, int y)
  {
    
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
}

