/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SourceFile.java
 * Purpose    :  Gain practice with packages
 * @author    :  Alejandra Vasquez
 * @author    :
 * Date       :  2018-09-05
 * Description:  Different classes will copy text in text file; used in conjunction with
 *                 MyFileCopier.java and TargetFile.java
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
// paackage statement
package copiersupport;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SourceFile {
  private String s = null;

  public SourceFile(String fileName){
    System.out.println("You specified that you wanted to copy " + fileName);
    try {
      BufferedReader wanted_file = new BufferedReader(new FileReader(fileName));
      // creates variable current_file which is the fileName being read
      s = wanted_file.readLine();
      wanted_file.close();
    } catch(IOException ioe) {}
  }

  public String getContent() {
    return s;
  }
}
