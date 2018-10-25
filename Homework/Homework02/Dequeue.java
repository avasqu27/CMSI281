/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Deque.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Creates a deque class with functions that reverse, insertLeft, insertRight, and removeLeft, removeRight.
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Arrays;
 public class Deque extends Queue {

  private int   maxSize;
  public  Queue frontQ ;
  public  Queue backQ ;
  public  int   count = -2;

  public Deque(int n) {                              //constructor
    super(n);
    maxSize = n;
    frontQ = new Queue(maxSize);
    backQ = new Queue(maxSize);
  }

  /*
    @param queue value to be inserted
    @return Queue; returns reversed queue
  */
  public Queue reverseQ(Queue name) {
    long[] contents = name.queArray;
    Queue temp = new Queue(name.maxSize);
    for (int i = contents.length-1; i >= 0; i--) {
      int k = 0;
      temp.insert(contents[i]);
      k++;
    }
    return temp;
  }

  /*
    @param long value to be inserted
    @return void; adds value to left of queue and reverses to update frontQ
  */
  public void insertRight(long j) {
    long[] queArray = frontQ.queArray;
    if(frontQ.rear == maxSize-1) {                   // deal with wraparound
      frontQ.rear = -1;
    }
    queArray[++frontQ.rear+1] = j;                   // increment rear and insert
    frontQ.nItems++;
    count++;
    backQ = reverseQ(frontQ);
    /************/
  //  backQ.nItems = frontQ.nItems;
  }

  /*
    @param long value to be inserted
    @return void; adds value to right of queue and reverses to update backQ
  */
  public void insertLeft(long j) {
    long[] queArray = backQ.queArray;
    if(backQ.rear == maxSize-1) {                   // deal with wraparound
     backQ.rear = -1;
    }
    queArray[++backQ.rear+1] = j;                   // increment rear and insert
    frontQ.nItems++;
    count++;
  //  backQ.nItems = frontQ.nItems;
    frontQ = reverseQ(backQ);
  }

  /*
    @return long; removes left value in backQ and updates frontQ
  */
  public void removeLeft() {
    // removeAt() function in Queue
    // will always remove first element in queue
    long[] queArray = frontQ.queArray;
    if(frontQ.front == maxSize){                     // deal with wraparound
      frontQ.front = 0;
    }
    frontQ.nItems--;
    for (int i = 0; i < maxSize; i++) {
      if (i >= frontQ.nItems) {
        queArray[i] = 0;
      }
      else {
        queArray[i] = frontQ.queArray[i+1];
      }
    }
    backQ = reverseQ(frontQ);
    count--;
    /************/
  //  backQ.nItems = frontQ.nItems;
  }

  /*
    @return long; removes right value in frontQ and updates backQ
  */
  public void removeRight() {
    // removeAt() function in IntLinkedList
    // will always remove last element in queue
    long[] queArray = backQ.queArray;
    if(frontQ.front == maxSize){                      // deal with wraparound
      frontQ.front = 0;
    }
    queArray[maxSize-backQ.nItems] = 0;
    backQ.nItems--;
    frontQ = reverseQ(backQ);
    /************/
    count--;
    //frontQ.nItems= backQ.nItems ;
  }

  /*
    @return boolean; returns true if queue is empty
  */
  public boolean isEmpty() {
    //int fq = frontQ.nItems;
    //int bq = backQ.nItems;
    return (count == 0);
    //return ( (frontQ.nItems==0 ) && (backQ.nItems==0) );
  }

  /*
    @return boolean; returns true if queue is full
  */
  public boolean isFull() {
    return ((count +2 )== maxSize);
   //return ( (frontQ.nItems==maxSize ) && (backQ.nItems==maxSize) );
  }
}
