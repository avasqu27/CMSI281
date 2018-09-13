/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntListInterface.java
 * Purpose    :  Gain practice with arrays
 * @author    :  BJ Johnson
 * @author    :
 * Date       :  2018-09-12
 * Description:  
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
   }
