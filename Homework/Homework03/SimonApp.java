/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SimonApp.java
 * Purpose    :  Play Simon
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-07
 * Description:  Tests Simon.java
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class SimonApp {
  import java.util.Scanner;
  public static void main(String[] args) {
    // Preparing to play Simon...
    int maxSize = 100;                 // size of the array holding pattern
    oddEvenSorter arr;                 // reference to array
    arr = new oddEvenSorter(maxSize);  // create the array

    public void colorArray() {
      oddEvenSorter colors;                 // reference to color array
      colors = new oddEvenSorter(3);  // create the color array
      colors.insert("R");
      colors.insert("B");
      colors.insert("G");
      colors.insert("Y");
    }

    System.out.println("");
    System.out.println("Let's play Simon! ");
    System.out.println("Type the correct color in the right pattern. ");
    System.out.println("I'm the PC and I'll tell you what order the colors are going to be in.  ");
    System.out.println("Ready? Type Y to start: ");
    System.out.println("");
    Scanner myInput = new Scanner( System.in );
    String play = myInput.nextLine().toUpperCase;
    //String play = myInput.toUpperCase;
    // we may want to do something to check if they give us a number

    while (play == "Y"){
      arr.insert(randomColor());
      System.out.println("Current pattern is: " + arr.display() );
      System.out.println("What's your guess?");
      Scanner guessIn = new Scanner(System.in);
      String guess = guessIn.nextLine().toUpperCase;
      if (guess == arr[i]){
        System.out.println("That's right! ");
        // This needs to be repeated multiple times
      } else {
        play = "N";
      }
    }
    System.out.println("Good try! The pattern was " + arr.display() );

    private String randomColor() {
      String randColor = Math.random()*(4);
      randColor = colors.[randColor]
      return randColor;
    }


}
