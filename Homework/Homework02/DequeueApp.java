/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  DequeueApp.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Testing for Dequeue.java 
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class DequeueApp {

   public static void main(String[] args) {

     Dequeue theDequeue = new Dequeue(5); // dequeue holds 5 items
     theDequeue.insertLeft(10);           // insert 4 items
     theDequeue.insertLeft(20);
     theDequeue.insertLeft(30);
     theDequeue.insertLeft(40);
     System.out.println("\nDequeue is currently: " + theDequeue.toString());
     theDequeue.removeLeft();             // remove 3 items
     theDequeue.removeLeft();             //    (10, 20, 30)
     theDequeue.removeLeft();
     theDequeue.insertRight(50);           // insert 4 more items
     theDequeue.insertRight(60);           //    (wraps around)
     theDequeue.insertRight(70);
     theDequeue.insertRight(80);
     System.out.println("\nDequeue is currently: " + theDequeue.toString());
     System.out.println("\nDequeue is now going to delete items and display items deleted ");
     while( !theDequeue.isEmpty() ) {     // remove and display all items
       long n = theDequeue.removeRight();      // (40, 50, 60, 70, 80)
       System.out.print(n);
       System.out.print(" ");
     }
     System.out.println("");
  } // end main()
} // end class DequeueApp
