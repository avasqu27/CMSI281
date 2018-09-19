/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArrayApp.java
 *  Purpose       :  Provides a class defining methods for the HighArray
 *  @author       :  Bob/Ale
 *  Date written  :  2018-09-19
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-08-30  Bob           Create HighArrayApp Class
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
 public class HighArrayApp {
	 
	 public static void main(String[] args) {
	                                      
         int maxSize = 100;                // array size
         HighArray arr;                    // reference to array
         arr = new HighArray(maxSize);     // create the array
         arr.insert(77); 
         arr.insert(99); 
         arr.insert(44); 
         arr.insert(55); 
         arr.insert(22); 
         arr.insert(88); 
         arr.insert(11); 
         arr.insert(00); 
         arr.insert(66); 
         arr.insert(33);
         arr.display();                    // display items
         int searchKey = 35;               // search for item
         if( arr.find(searchKey) ) {   
             System.out.println("Found " + searchKey); }
         else {
              System.out.println("Can’t find " + searchKey);
         }
         arr.delete(00);                   // delete 3 items
         arr.delete(55); 
         arr.delete(99);
         arr.display();                    // display items again
         HighArray array3 = new HighArray(3);
         array3.insert(10);
         array3.insert(11);
         array3.insert(12);
         HighArray array0 = new HighArray(0);
         HighArray array2 = new HighArray(2);
         System.out.println("Commence testing....");
         System.out.println("Is there an element 10? Expecting true: ");
         System.out.println( array3.find(10));
         System.out.println("Is there an element 2? Expecting false: ");
         System.out.println( array3.find(2));
         System.out.println("Is there an element 3? Expecting false: ");
         System.out.println( array3.find(3));
         System.out.println("Testing for delete:");
         System.out.println("Finding value 10 to delete; expecting true");
         System.out.println(array3.delete(10));
         System.out.println("Finding value 9 to delete; expecting false");
         System.out.println(array3.delete(9));
         System.out.println("Get Max in array; expecting -1");
         System.out.println(array0.getMax());
         System.out.println("Get Max in array; expecting 11");
         System.out.println(array3.getMax());
         System.out.println("Get Max in array; expectig -1");
         System.out.println(array2.getMax());
         System.out.println("Out of curiosity... inserting a 12 in arraaay and running getMax()");
         System.out.println("Expecting 12");
         array3.insert(12);
         System.out.println(array3.getMax());
         System.out.println("Inserting another 12 in arraaay and running getMax()");
         System.out.println("Creating new array (length 9), inserting values, running getMax()");
         System.out.println("Expecting 1000000");
         HighArray array9 = new HighArray(9);
         array9.insert(90);
         array9.insert(20);
         array9.insert(1000000);
         array9.insert(2);
         array9.insert(17);
         array9.insert(98);
         array9.insert(75);
         array9.insert(46);
         array9.insert(62);
         System.out.println(array9.getMax());
         System.out.println("Creating new array (length 5), inserting values, running getMax()");
         System.out.println("Expecting 24");
         HighArray array5 = new HighArray(5);
         array5.insert(0);
         array5.insert(12);
         array5.insert(12);
         array5.insert(24);
         array5.insert(24);
         System.out.println(array5.getMax());
         System.out.println("Creating new array (length 7), inserting values, running getMax()");
         System.out.println("Expecting 24");
         HighArray array7 = new HighArray(7);
         array7.insert(0);
         array7.insert(12);
         array7.insert(12);
         array7.insert(24);
         array7.insert(24);
         System.out.println(array7.getMax());
         System.out.println("Creating new array (length 4), inserting values, running getMax()");
         System.out.println("Expecting 24");
         HighArray array4 = new HighArray(4);
         array4.insert(0);
         array4.insert(12);
         array4.insert(12);
         array4.delete(12);
         array4.insert(24);
         System.out.println(array4.getMax());
         System.out.println("Creating new array (length 6), inserting and deleting values, gets length, & runs getMax()");
         System.out.println("Expecting 12");
         HighArray array6 = new HighArray(6);
         array6.insert(0);
         array6.insert(12);
         array6.insert(12);
         array6.delete(0);
         System.out.println("Length is " + array6.getLength());
         System.out.println(array6.getMax());
         HighArray arrayOne = new HighArray(8);
         arrayOne.insert(5);
         arrayOne.insert(6);
         arrayOne.insert(5);
         arrayOne.insert(7);
         arrayOne.insert(8);
         arrayOne.insert(6);
         arrayOne.insert(9);
         arrayOne.insert(6);
         System.out.println("With Duplicates " + arrayOne.toString());
         arrayOne.noDups();
         System.out.println("Without Duplicates " + arrayOne.toString());
         HighArray arrayTwo = new HighArray(9);
         arrayTwo.insert(5);
         arrayTwo.insert(6);
         arrayTwo.insert(5);
         arrayTwo.insert(7);
         arrayTwo.insert(8);
         arrayTwo.insert(6);
         arrayTwo.insert(6);
         arrayTwo.insert(6);
         arrayTwo.insert(5);
         System.out.println("With Duplicates " + arrayTwo.toString());
         arrayTwo.noDups();
         System.out.println("Without Duplicates " + arrayTwo.toString());
         HighArray arrayThree = new HighArray(11);
         arrayThree.insert(4);
         arrayThree.insert(9);
         arrayThree.insert(10);
         arrayThree.insert(71);
         arrayThree.insert(84);
         arrayThree.insert(56);
         arrayThree.insert(26);
         arrayThree.insert(16);
         arrayThree.insert(55);
         arrayThree.insert(56);
         arrayThree.insert(56);
         System.out.println("With Duplicates " + arrayThree.toString());
         arrayThree.noDups();
         System.out.println("Without Duplicates " + arrayThree.toString());
         HighArray arrayFour = new HighArray(11);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         arrayFour.insert(20);
         System.out.println("With Duplicates " + arrayFour.toString());
         arrayFour.noDups();
         System.out.println("Without Duplicates " + arrayFour.toString());
         HighArray arrayFive = new HighArray(12);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(19);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         arrayFive.insert(20);
         System.out.println("With Duplicates " + arrayFive.toString());
         arrayFive.noDups();
         System.out.println("Without Duplicates " + arrayFive.toString());
         }
 }
