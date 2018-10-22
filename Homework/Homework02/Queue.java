/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Queue.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  JAVADOCS !!!!!!!!!!!!!!!!!!!!
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class Queue {

  public   int    maxSize;
  public   long[] queArray;
  public   int    front;
  public   int    rear;
  public   int    nItems;

 // our queue should dis[play contents of the queue.
  // Show the queue contents from the first item (inserted first) to the last
  // no indication to whether sequence is broken
  // must be tested with displaying one item
  // must be tested with displaying no items
  //--------------------------------------------------------------

  public Queue(int s) { // constructor
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }
//--------------------------------------------------------------
  /*
    @param long value to be inserted
    @return void; adda value to end of queue
  */
  public void insert(long j) {               // put item at rear of queue
    if(rear == maxSize-1){                   // deal with wraparound
      rear = -1;
    }
    queArray[++rear] = j;                   // increment rear and insert
    nItems++;                               // one mre item
  }
//--------------------------------------------------------------\
  /*
    @return long; removes item in front of queue
  */
  public long remove() {// take item from front of queue
    long temp = queArray[front++]; // get value and incr front
    if(front == maxSize){ // deal with wraparound
      front = 0;
    }
    nItems--; // one less item
    return temp;
  }
//--------------------------------------------------------------
  /*
    @return long; looks at front of queue
  */
   public long peekFront() {     // peek at front of queue
     return queArray[front];
   }
//--------------------------------------------------------------
  /*
    @return boolean; returns true if queue is empty
  */
   public boolean isEmpty() {     // true if queue is empty {
     return (nItems==0);
   }
//--------------------------------------------------------------
  /*
    @return boolean; returns false if queue is empty
  */
   public boolean isFull() {     // true if queue is full {
     return (nItems==maxSize);
    }
//--------------------------------------------------------------
  /*
    @return int; returns number of items in queue
  */
  public int size() {           // number of items in queue {
     return nItems;
  }
//--------------------------------------------------------------
  public String toString() {
    String s = "[ ";
    for (int i = 0; i < queArray.length; i++) {
      s = s + queArray[i] + " ";
    }
    s = s + "]";
    return s;
  }
//--------------------------------------------------------------

 // end class Queue

}
