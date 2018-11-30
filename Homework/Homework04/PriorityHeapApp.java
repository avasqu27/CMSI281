/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PriorityHeapApp.java
 *  Purpose       :  Provides a tester for PriorityHeap
 *  @author       :  Ale, Bob
 *  Date written  :  2018-11-27
 *  Notes         :  None right now.  We'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.io.*;
public class PriorityHeapApp {
    public static void main(String[] args) throws IOException {
        System.out.println("\nCreating new Heap... \n \ntheHeap coming through" );
        PriorityHeap theHeap = new PriorityHeap(5);
        theHeap.insert(30);
        theHeap.insert(50);
        theHeap.insert(10);
        theHeap.insert(40);
        theHeap.insert(20);
        if (theHeap.isFull()) {
            System.out.println("theHeap is Full. Very satisfied! ");
        }
        while( !theHeap.isEmpty() ) {
            long item = theHeap.remove();
            System.out.println(item + " "); // 50, 40, 30, 20, 10 } // end while
        }

        System.out.println("New Heap coming through! \n\nMake way for theHeapest" );
        PriorityHeap theHeapest = new PriorityHeap(8);
        theHeapest.insert(140);
        theHeapest.insert(95);
        theHeapest.insert(39);
        theHeapest.insert(11);
        theHeapest.insert(70);
        theHeapest.insert(97);
        theHeapest.insert(270);
        theHeapest.insert(117);
        if (theHeapest.isFull()) {
            System.out.println("theHeapest is Full. Very satisfied! ");
        }
        while( !theHeapest.isEmpty() ) {
            long item = theHeapest.remove();
            System.out.println(item + " "); // 270, 140, 117, 97, 95, 70, 39, 11 } // end while
        }
        System.out.println("");
        // end main()
//-------------------------------------------------------------
    } // end class PriorityQApp
}
