/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PriorityHeap.java
 *  Purpose       :  Provides a class defining methods for the PriorityHeap class
 *  @author       :  Ale, Bob
 *  Date written  :  2018-11-27
 *  Notes         :  None right now.  We'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.io.*;
public class PriorityHeap {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private Heap h;
    private int nItems;
    //-------------------------------------------------------------
    public PriorityHeap(int s) {   // constructor
        maxSize = s;
        h = new Heap(maxSize);
        nItems = 0;
    }

    /*
    @param item ; element inserted into array
    @return void ; increments size of the existing array
    */
    //-------------------------------------------------------------
    public void insert(int item) {   // insert item
        h.insert(item);
        nItems++;
    } // end insert()

    /*
    @return int r ; maximum value removed
    */
    //-------------------------------------------------------------
    public int remove() { // remove maximum item
        int r = h.heapArray[0].getKey();
        h.remove();
        nItems--;
        return r;
    }

    /*
    @return int r ; looks at maximum value
    */
    //-------------------------------------------------------------
    public int peekMax() { // peek at maximum item
        int r = h.heapArray[0].getKey();
        return r;
    }

    /*
    @return boolean ; returns true if heap is empty
    */
    //-------------------------------------------------------------
    public boolean isEmpty() { // true if heap is empty
        return (nItems==0);
    }

    /*
    @return boolean ; returns true if heap is full
    */
    //-------------------------------------------------------------
    public boolean isFull() { // true if heap is full
     return (nItems == maxSize);
    }
    //-------------------------------------------------------------
} 
