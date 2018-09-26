/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntQueue.java
 * Purpose    :  Gain practice with stacks
 * @author    :  BJ Johnson; appended by Alejandra
 * @author    :
 * Date       :  2018-09-26
 * Description:  Constructs queue based on IntStack.java file
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 public class IntQueue extends IntLinkedList{

  IntLinkedList myQueue;
  // FIFO: First In, First Out.

  IntQueue() {
    myQueue = new IntLinkedList();         // constructor; created a new linked list
  }

  public void push( int itemToPush ) {
    myQueue.prepend( itemToPush );
  }

  public int peek() {
    return myQueue.getIteratorAt( myQueue.returnSize()-1 ).getCurrentInt();     // we use the iterator
  }

  public int pop() {
    return myQueue.removeAt( myQueue.returnSize()-1 );
  }

  public static void main( String[] args ) {
   IntQueue testQueue = new IntQueue();
   testQueue.push( 19 );
   testQueue.push( 23 );
   testQueue.push( 29 );
   testQueue.push( 31 );
   testQueue.push( 37 );
   testQueue.push( 41 );
   testQueue.push( 43 );
   testQueue.push( 47 );
   testQueue.push( 51 );
   testQueue.push( 57 );
   System.out.println( "The top of the stack: " + testQueue.peek() );      //19
   System.out.println( "Removing top thing: " + testQueue.pop() );         //19
   System.out.println( "The top of the stack: " + testQueue.peek() );      //23
   System.out.println( "Removing top thing: " + testQueue.pop() );         //23
   System.out.println( "The top of the stack: " + testQueue.peek() );      //29
   System.out.println( "Removing top thing: " + testQueue.pop() );         //29
   System.out.println( "The top of the stack: " + testQueue.peek() );      //31
   testQueue.push( testQueue.pop() + testQueue.pop() );
   System.out.println( "The top of the stack: " + testQueue.peek() );      //41
  }

}
