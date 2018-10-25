/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  DequeueApp.java
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
class DequeueApp {

   public static void main(String[] args) {

     Dequeue theDequeue = new Dequeue(5); // dequeue holds 5 items
     System.out.println("\nDequeue is going to insert 10,20, 30, and 40 to the left. ");
     theDequeue.insertLeft(10);           // insert 4 items
     theDequeue.insertLeft(20);
     theDequeue.insertLeft(30);
     theDequeue.insertLeft(40);
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is going to removeLeft() 3 times. ");
     theDequeue.removeLeft();             // remove 3 items
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     theDequeue.removeLeft();             //    (10, 20, 30)
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     theDequeue.removeLeft();
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is going to insert 50, 60, 70, and 80 to the right " );
     theDequeue.insertRight(50);           // insert 4 more items
     theDequeue.insertRight(60);           //    (wraps around)
     theDequeue.insertRight(70);
     theDequeue.insertRight(80);
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is now going to delete items: repeated 3 times: ");
     theDequeue.removeRight();
     theDequeue.removeRight();
     theDequeue.removeRight();
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is going to insert 45,0, 32, and 45 to the left. ");
     theDequeue.insertLeft(45);           // insert 4 items
     theDequeue.insertLeft(0);
     theDequeue.insertLeft(32);
     theDequeue.insertLeft(45);
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is going to removeLeft() 3 times. ");
     theDequeue.removeLeft();             // remove 3 items
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     theDequeue.removeLeft();             //    (10, 20, 30)
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     theDequeue.removeLeft();
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is going to insert 66, 888, 10, and 99 to the right " );
     theDequeue.insertRight(66);           // insert 4 more items
     theDequeue.insertRight(888);           //    (wraps around)
     theDequeue.insertRight(10);
     theDequeue.insertRight(99);
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("\nDequeue is now going to delete items from the right: repeated 4 times: ");
     theDequeue.removeRight();
     theDequeue.removeRight();
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     theDequeue.removeRight();
     theDequeue.removeRight();
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());

     int x = theDequeue.queArray.length;
     /*
     while (x >= 0 ) {
  //   while( !theDequeue.isEmpty() ) {     // remove and display all items
       long n = theDequeue.removeRight();      // (40, 50, 60, 70, 80)
       System.out.println(n);
       System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
       x--;
     }
     */
     System.out.println("\nDequeue is currently: " + theDequeue.frontQ.toString());
     System.out.println("");
  } // end main()
} // end class DequeueApp
