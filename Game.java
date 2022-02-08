import java.util.Scanner;


public class Game
{
    private Player player1;
    private Player player2;
    int roundNumber = 0;
    boolean playAgain = true;
    // constructors
   public Game()
    {
        
        player1 = new Player();
        player2 = new Player();
        double playerSelect = Math.random() * (2 - 1) + 1;
        int playerSelecter = (int) playerSelect;
    if (playerSelecter == 1)
        {
        System.out.println(Player.name() + " you are going first");
        }
    else 
        {
            System.out.println(player2 + " you are going first");
        }
   }
   
    public void play()
    {
      

    }
private boolean playAgain()
{
    String playAgain = "";
    System.out.println("Would you like to play again yes->(a), or no->(b)");
    Scanner sc = new Scanner(System.in);
          playAgain = sc.nextLine();
          if (playAgain.equals("a"))
          {
              System.out.println("Starting round " + roundNumber + ", good luck!");
              //points check
              // start round again
              return true;
          }
          else if(playAgain.equals("b"))
          {
              System.out.println("You chose for the game to end, here are the results");
              return false;
          }
          else
          {
              System.out.println("Please select either a or b");
          }
        return false;
          
        }










} // end of whole class
