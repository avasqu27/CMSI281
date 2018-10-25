/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  DequeApp.java
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
class DequeApp {

   public static void main(String[] args) {

     Deque theDeque = new Deque(5); // Deque holds 5 items
     System.out.println("\nDeque is going to insert 10,20, 30, and 40 to the left. ");
     theDeque.insertLeft(10);           // insert 4 items
     theDeque.insertLeft(20);
     theDeque.insertLeft(30);
     theDeque.insertLeft(40);
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nDeque is going to removeLeft() 3 times. ");
     theDeque.removeLeft();             // remove 3 items
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeLeft();             //    (10, 20, 30)
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeLeft();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nDeque is going to insert 50, 60, 70, and 80 to the right " );
     theDeque.insertRight(50);           // insert 4 more items
     theDeque.insertRight(60);           //    (wraps around)
     theDeque.insertRight(70);
     theDeque.insertRight(80);
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nIs the deque full though? " + theDeque.isFull());
     System.out.println("\nDeque is now going to delete items: repeated 3 times: ");
     theDeque.removeRight();
     theDeque.removeRight();
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nDeque is going to insert 45,0, 32, and 45 to the left. ");
     theDeque.insertLeft(45);           // insert 4 items
     theDeque.insertLeft(0);
     theDeque.insertLeft(32);
     theDeque.insertLeft(45);
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nDeque is going to removeLeft() 3 times. ");
     theDeque.removeLeft();             // remove 3 items
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeLeft();             //    (10, 20, 30)
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeLeft();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nDeque is going to insert 66, 888, 10, and 99 to the right " );
     theDeque.insertRight(66);           // insert 4 more items
     theDeque.insertRight(888);           //    (wraps around)
     theDeque.insertRight(10);
     theDeque.insertRight(99);
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nIs the deque empty though? " + theDeque.isEmpty());
     System.out.println("\nDeque is now going to delete items from the right: repeated 5 times: ");
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     theDeque.removeRight();
     System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
     System.out.println("\nIs the deque empty though? " + theDeque.isEmpty());

     int x = theDeque.queArray.length;
     /*
     while (x >= 0 ) {
  //   while( !theDeque.isEmpty() ) {     // remove and display all items
       long n = theDeque.removeRight();      // (40, 50, 60, 70, 80)
       System.out.println(n);
       System.out.println("\nDeque is currently: " + theDeque.frontQ.toString());
       x--;
     }
     */
     System.out.println("\nOur final Deque is: " + theDeque.frontQ.toString());
     System.out.println("");
  } // end main()
} // end class DequeApp
