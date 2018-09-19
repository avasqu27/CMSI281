/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Provides a class defining methods for the HighArray
 *  @author       :  Bob, Ale
 *  Date written  :  2018-09-19
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-19  Bob/Ale       Create HighArray Class
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
public class HighArray {

    private long[] a;                         // ref to array a
    private int nElems;                       // number of data items
    //-----------------------------------------------------------
    /*
     @param max number of elements in array
     */
    public HighArray(int max) {              // constructor
        a = new long[max];                    // create the array
		nElems = 0;                           // no items yet
    }
    //-----------------------------------------------------------
    /*
    @param searchKey value to be found
    @return boolean; logic verifies whether value is there or not
    */
    public boolean find(long searchKey) {    // find specified value
        int j;
        for (j = 0; j < nElems; j++) {        // for each element,
            if (a[j] == searchKey) {          // found item?
                break;                        // exit loop before end
		    }
        }
		 if (j == nElems) {                // gone to end?
                return false;                 // yes, can’t find it
			}
        return true;
	}
	//-----------------------------------------------------------
    /*
     @param value ,value to be inserted into array
    */
    public void insert(long value) {          // put element into array
        a[nElems] = value;                    // insert it
		nElems++;                             // increment size
        //
        // insert try/catch statement to "catch" arrays that are too long
        // Error message: Arrays are not long enough!
        //
    }
	//-----------------------------------------------------------
    /*
     @param value ,value to be deleted
     @return boolean, logic verifies whether value can be deleted
    */
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {        // look for it
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) {                // can’t find it
            return false;
        }
        else {                            // found it
            for(int k=j; k<nElems; k++) { // move higher ones down
				a[k] = a[k+1];
                nElems--;                 // decrement size
				return true;
			}

         }
        return true;
    }
    //-----------------------------------------------------------
    /*
     displays system.out
    */
	public void display() {                   // displays array contents
        for (int j = 0; j < nElems; j++) {    // for each element,
            System.out.print(a[j] + " ");     // display it
		}
	    System.out.println(" ");
    }
    //-----------------------------------------------------------
    /*
     @param value ,value to be deleted
     @return boolean, logic verifies whether value can be deleted
    */
    public long getMax() {
        int j;
        long highestValue = -1;
        if (a == null) {
            return (-1);
        }
        else {
            for (j = 0; j < nElems; j++) {
                if (j == 0) {                             // set first value to highestValue
                    highestValue = a[j];
                }
                if (highestValue <= a[j]) {
                    highestValue = a[j];
                }
            }
        }
        return highestValue;
    }
    //-----------------------------------------------------------
    /*
     @param none
     @return long[], array without duplicates
    */
    public long[] noDups() {
        int arraySize = a.length;
        HighArray temp = new HighArray(arraySize);
        int called = 0;
        for (int i = 0; i < a.length - 1; i++) {
            long check = a[i];
            int count = 0;
            for (int k = 0; k < a.length - 1; k++) {
                if (i == k) {
                    continue;
                }
                if (check == a[k]) {
                    count = count + 1;
                }
            }
            if (temp.find(check) == false) {
                arraySize = arraySize - count;
                temp.insert(check);
            }
        }
        long[] temp2 = new long[arraySize-1];
        String[] temps = temp.stringArray();
        for (int i = 0; i < arraySize-1; i++) {
            temp2[i] = Long.valueOf(temps[i]);
        }
        a = temp2;
        return a;
    }
    //-----------------------------------------------------------
    /*
     @param none
     @return integer, returns length of array
    */
    public int getLength() {
        return a.length;
    }
    //-----------------------------------------------------------
    /*
     @param none
     @return string[], represents array as string Array type
    */
    public String[] stringArray() {
        String[] ans = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = String.valueOf(a[i]);
        }
        return ans;
    }
    //-----------------------------------------------------------
    /*
     @param none
     @return string, array as single string
    */
    public String toString() {
        String ans ="[";
        for (int i = 0; i < a.length; i++) {
            ans = ans + String.valueOf(a[i]);
            if (i < a.length - 1) {
                ans = ans + ",";
            }
        }
        ans =  ans + "]";
        return ans;
    }
    //-----------------------------------------------------------
    public static void main(String[] args ) {
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
