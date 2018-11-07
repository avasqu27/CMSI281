/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SimonApp.java
 * Purpose    :  Plays Simon
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-07
 * Description:  Tests Simon.java
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Scanner;
class SimonApp {

  public static void main(String[] args) throws InterruptedException {
    String play = "";
    System.out.println("");
    System.out.println("Let's play Simon! ");
    System.out.println("Type the correct color in the right pattern. ");
    System.out.println("I'm the PC and I'll tell you what order the colors are going to be in.  ");
    System.out.println("Ready? Type Y to start: ");
    System.out.println("");
    Scanner myInput = new Scanner( System.in );
    try {
      play = myInput.nextLine().toUpperCase();
      if (play.equals("Y") == false) {
        throw new NumberFormatException();
      }
    }
    catch (NumberFormatException e) {
      System.out.println("You said " + play);
      System.out.println("You should've said Y ");
      play = "N";
    }

     // Preparing to play Simon...
    int maxSize = 100;                 // size of the array holding pattern
    Simon arr;                         // reference to array
    arr = new Simon(maxSize);          // create the array
    // CREATING COLOR ARRAY USING SIMON
    Simon colors = new Simon(4);       // create the color array
    colors.insert("R");
    colors.insert("B");
    colors.insert("G");
    colors.insert("Y");

    int randColor = (int)Math.floor(Math.random()*(4));

    while (play != "N") {
      String n = colors.a[randColor];
      System.out.println("So far, so good! ");
      arr.insert(n);
      System.out.println("Current pattern is: " );
      arr.display();
      System.out.println("Wait 4 seconds to type your answer...");
      Thread.sleep(4000);
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.out.println("What's your guess? (Put spaces in between)");

      Scanner guessIn = new Scanner(System.in);
      String guess = guessIn.nextLine().toUpperCase();
      String[] guessArr = guess.split(" ");
      for (int i = 0;  i < arr.nElems; i++) {
        try {
          if (guessArr[i].equals(arr.a[i])) {
            continue;
          } else {
            System.out.println("That's wrong! ");
            play = "N";
            break;
          }
        }
        catch(Exception e) {
          System.out.println("Something went hinky");
          play = "N";
          break;
        }
      }
      randColor = (int)Math.floor(Math.random()*(4));
    }
    System.out.println("ERRR! thank you for playing. The pattern was " );
    arr.display();
  }
}
