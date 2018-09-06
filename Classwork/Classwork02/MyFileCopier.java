/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  MyFileCopier.java
 * Purpose    :  Gain practice with packages
 * @author    :  Alejandra Vasquez
 * @author    :
 * Date       :  2018-09-05
 * Description:  Different classes will perform different operations; this will be the main program that
 *                 will "instantiate" the other two files in copiersupport to create a dummy.txt copy
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.util.Scanner;

public class MyFileCopier {
  public static void main(String args[]){
    // asks user for a file name to be called upon
    Scanner myInput = new Scanner( System.in );
    System.out.println("Provide the name of the file to be copied: ");
    String inputName = myInput.nextLine();
    // instantiate SourceFile class
    SourceFile wanted_file = new SourceFile(inputName);
    // returns a String
    TargetFile target_file = new TargetFile( (inputName + ".copy"), wanted_file.getContent() );

  }
}
