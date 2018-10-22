/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  QueueApp.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Tests Queue.java
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class QueueApp {

   public static void main(String[] args) {
     
     Queue theQueue = new Queue(5); // queue holds 5 items
     theQueue.insert(10);           // insert 4 items
     theQueue.insert(20);
     theQueue.insert(30);
     theQueue.insert(40);
     System.out.println("\nQueue is currently: " + theQueue.toString());
     theQueue.remove();             // remove 3 items
     theQueue.remove();             //    (10, 20, 30)
     theQueue.remove();
     theQueue.insert(50);           // insert 4 more items
     theQueue.insert(60);           //    (wraps around)
     theQueue.insert(70);
     theQueue.insert(80);
     System.out.println("\nQueue is currently: " + theQueue.toString());
     System.out.println("\nQueue is now going to delete items and display items deleted ");
     while( !theQueue.isEmpty() ) {     // remove and display all items
       long n = theQueue.remove();      // (40, 50, 60, 70, 80)
       System.out.print(n);
       System.out.print(" ");
     }
     System.out.println("");
  } // end main()
} // end class QueueApp
