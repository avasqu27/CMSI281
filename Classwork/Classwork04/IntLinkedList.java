/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    :  Gain practice with lists and index locations
 * @author    :  BJ Johnson
 * @author    :
 * Date       :  2018-09-05
 * Description:  Constructs lists
 *                 Creates an insertAt() method to take index location and insert a node
                   Creates removeAt() method to take integer location only, removing node at index
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedListTester {
  public static void main( String[] args ) {
    IntLinkedList myList = new IntLinkedList();
    myList.prepend( 23 );
    myList.prepend( 19 );
    myList.prepend( 17 );
    myList.prepend( 13 );
    myList.prepend( 11 );
    myList.prepend(  7 );
    myList.prepend(  5 );
    myList.prepend(  3 );
    myList.prepend(  2 );
    IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
    myIt = myList.getIteratorAt( 3 );
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
    myIt = myList.getIteratorAt( 5 );
    System.out.println( "Node at 5 is: " + myIt.getCurrentInt() );
    // [2,3,5,7,11,13,17,19,23]
    myList.insertAt(5, 101);
    // [2,3,5,7,11,101,13,17,19,23]
    // [0,1,2,3, 4, 5, 6, 7, 8. 9 ]
    myIt = myList.getIteratorAt( 5 );
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    // [2,3,5,7,11,13,17,19,23]
    // [0,1,2,3, 4, 5, 6, 7, 8]
    System.out.println( "Removed: " + myList.removeAt(5));
    myIt = myList.getIteratorAt( 7 );
    System.out.println( "Node at 7 is: " + myIt.getCurrentInt() );
    myList.insertAt(7, 245);
    myIt = myList.getIteratorAt( 7 );
    // [2,3,5,7,11,13,17,245, 19,23]
    // [0,1,2,3, 4, 5, 6, 7,  8  9]
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );
    // [2,3,5,7,11,13,17,19,23]
    // [0,1,2,3, 4, 5, 6, 7, 8]
    System.out.println( "Removed: " + myList.removeAt(7));
  }
}
