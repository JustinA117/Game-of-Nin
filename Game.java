import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.io.File;

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
