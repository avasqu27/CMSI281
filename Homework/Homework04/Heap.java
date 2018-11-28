/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  heap.java
 *  Purpose       :  Provides a class defining methods for the Node and Heap class
 *  @author       :  Ale, Bob
 *  Date written  :  2018-11-27
 *  Notes         :  None right now.  We'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
class Node {
    private int iData; // data item (key)
    // -------------------------------------------------------------
    public Node(int key) {  // constructor
        iData = key;
    }
    // -------------------------------------------------------------
    public int getKey() {
        return iData;
    }
    // -------------------------------------------------------------
    public void setKey(int id) {
        iData = id;
    }
    // -------------------------------------------------------------
} // end class Node

public class Heap {
    public Node[] heapArray;
    private int maxSize; // size of array
    private int currentSize; // number of nodes in array
    // -------------------------------------------------------------
    public Heap(int mx) { // constructor
        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize]; // create array
    }
    // -------------------------------------------------------------
    public boolean isEmpty() {
        return currentSize==0;
    }
    // -------------------------------------------------------------
    public boolean insert(int key) {
        if(currentSize==maxSize) {
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    } // end insert()
    // -------------------------------------------------------------
    public void trickleUp(int index) {
        int parent = (index-1)/2;
        Node bottom = heapArray[index];
        while ( (index > 0) && (heapArray[parent].getKey()) < (bottom.getKey()) ) {
            heapArray[index] = heapArray[parent]; // move it down
            index = parent;
            parent = (parent-1)/2;
        } // end while
        heapArray[index] = bottom;
    }   // end trickleUp()
    // -------------------------------------------------------------
    public Node remove() { // delete item with max key
        Node root = heapArray[0];  // (assumes non-empty list)
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    } // end remove()
    // -------------------------------------------------------------
    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];        // save root
        while(index < currentSize/2) {      // while node has
            int leftChild = 2*index+1;         // at least one child
            int rightChild = leftChild+1;
            if((rightChild < currentSize) && (heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) ) {
                largerChild = rightChild;
            }
            else {
                largerChild = leftChild;
            }    // top >= largerChild?
            if( top.getKey() >= heapArray[largerChild].getKey() ) {
                break;
            }    // shift child up
            heapArray[index] = heapArray[largerChild];
            index = largerChild; // go down
        } // end while
        heapArray[index] = top; // root to index
    }  // end trickleDown()
    // -------------------------------------------------------------
    public boolean change(int index, int newValue) {
        if( (index<0) || (index>=currentSize) ) {
            return false;
        }
        int oldValue = heapArray[index].getKey(); // remember old
        heapArray[index].setKey(newValue);        // change to new
        if(oldValue < newValue) {          // if raised
            trickleUp(index);              // trickle it up
        }
        else {                             // if lowered
            trickleDown(index);            // trickle it down
        }
        return true;
    }   //end change()
//-------------------------------------------------------------
    public void displayHeap() {
        System.out.print("heapArray: ");          // array format
        for(int m=0; m<currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            else {
                System.out.print( "-- ");
            }
        }
        System.out.println();
        int nBlanks = 32;           // heap format
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;                                 // current item
        String dots = "...............................";
        System.out.println(dots+dots);             // dotted top line
        while(currentSize > 0) {                   // for each heap item
            if(column == 0) {                         // first item in row?
                for(int k=0; k<nBlanks; k++) {          // preceding blanks
                    System.out.print("");
                }     // display item
            }
            System.out.print(heapArray[j].getKey());
            if(++j == currentSize) {                // done?
                break;
            }
            if(++column==itemsPerRow) {            // end of row?
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            }
            else {
                for(int k=0; k<nBlanks*2-2; k++) {
                    System.out.print(" "); //
                } // end for
            }
        }
        System.out.println("\n"+dots+dots);   //  dotted bottom line
    } // end displayHeap()

}
