/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Dequeue.java
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
 public class Dequeue extends Queue {

  private  int   maxSize;

  public  Queue frontQ ;//= new Queue(maxSize); //= new Queue(0);
  public  Queue backQ ;//= new Queue(maxSize);  //= new Queue(0);

  public Dequeue(int n) { //constructor
    super(n);
    maxSize = n;
    frontQ = new Queue(maxSize); //= new Queue(0);
    backQ = new Queue(maxSize);
    //System.out.println(Arrays.toString(frontQ.queArray));
    //System.out.println("Length in Dequeue: " + frontQ.queArray.length);
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
  public void insertLeft(long j) {
   //backQ.insert(j);
   //System.out.println("Display Q: " + frontQ.toString());
   long[] queArray = backQ.queArray;
   if(backQ.rear == maxSize-1) {                   // deal with wraparound
      backQ.rear = -1;
   }
   //System.out.println("J value: " + j);
   //System.out.println("Length: " + queArray.length);
   //System.out.println("Rear: " + rear);
   //System.out.println("Rear of BackQ: " + backQ.rear);
  //  System.out.println("Rear of BackQ: " + ++backQ.rear);
   queArray[++backQ.rear] = j;                   // increment rear and insert
   backQ.nItems++;
   frontQ = reverseQ(backQ);
  }

  /*
    @param long value to be inserted
    @return void; adds value to right of queue and reverses to update backQ
  */
  public void insertRight(long j) {
   frontQ.insert(j);
   backQ = reverseQ(frontQ);
  }

  /*
    @return long; removes left value in backQ and updates frontQ
  */
  public long removeLeft() {
    // removeAt() function in Queue
    // will always remove first element in queue
    long[] queArray = backQ.queArray;
    long n = queArray[backQ.front++];

    if(backQ.front == maxSize){ // deal with wraparound
      front = 0;
    }
    maxSize--;
    frontQ.front++;
    for (int i = 0; i < maxSize; i++) {
      queArray[i] = backQ.queArray[i+1];
    }
    backQ.queArray = queArray;
    backQ.nItems--; // one less item
    frontQ = reverseQ(backQ);
    return n;
  }

  /*
    @return long; removes right value in frontQ and updates backQ
  */
  public long removeRight() {
    // removeAt() function in IntLinkedList
    // will always remove last element in queue
    long n = removeLeft();
    backQ = reverseQ(frontQ);
    return n;
  }

  /*
    @return boolean; returns true if queue is empty
  */
  public boolean isEmpty() {
    return ( (frontQ.nItems==0 ) && (backQ.nItems==0) );
  }

  /*
    @return boolean; returns true if queue is full
  */
  public boolean isFull() {
   return ( (frontQ.nItems==maxSize ) && (backQ.nItems==maxSize) );
  }
}
