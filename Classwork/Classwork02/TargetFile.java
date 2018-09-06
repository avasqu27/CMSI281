/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  TargetFile.java
 * Purpose    :  Gain practice with packages
 * @author    :  Alejandra Vasquez
 * @author    :
 * Date       :  2018-09-05
 * Description:  Writes a dummy.txt copy; used in conjunction with MyFileCopier.java and SourceFile.java
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
package copiersupport;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {
  public TargetFile(String fileName, String content){

    try {
      BufferedWriter wanted_file = new BufferedWriter(new FileWriter(fileName));
      wanted_file.write(content);
      // Writes content into the copy text file
    } catch(IOException ioe) {}
  }
  
}
