public Enemy extends GameObject
{
  private int dx;
  private int dy;
  private Enemy[][];
  

  public Enemy(int x, int y)
  {
    
  }  

//3 different types of enemys, each has dif sprite 
    //Green - two lives, changes to blue/white sprite once hit, flies into place but will dive bomb, can fire laser blasts
    //Blue/Yellow - one life, will fly and around and dive bomb
    //Red/white - one life, flies into place and stay, can fire laser blasts
//Green enemies fill top row of ships, blue/yellwo fill bottom, red/white fill middle
//all enemies in the rows shift one direction at a time once reachign the side, they shift down 
}

