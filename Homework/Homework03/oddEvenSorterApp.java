/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  oddEvenSorterApp.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-07
 * Description:  Tests oddEvenSort
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class oddEvenSorterApp {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Now starting a new array: ");
    int maxSize = 100;                 // array size
    oddEvenSorter arr;                 // reference to array
    arr = new oddEvenSorter(maxSize);         // create the array
    arr.insert(77);                    // insert 10 items
    arr.insert(9);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(1);
    arr.insert(66);
    arr.insert(33);
    arr.display();                     // display items
    arr.oddEvenSort();                 // odd/even sort them
    arr.display();                     // display them again
    System.out.println("");
    System.out.println("Now starting a new array: ");
    maxSize = 100;                 // array size
    oddEvenSorter arr1;                 // reference to array
    arr1 = new oddEvenSorter(maxSize);         // create the array
    arr1.insert(89);                    // insert 10 items
    arr1.insert(65);
    arr1.insert(73);
    arr1.insert(34);
    arr1.insert(21);
    arr1.insert(76);
    arr1.insert(89);
    arr1.insert(5);
    arr1.insert(6);
    arr1.insert(13);
    arr1.insert(19);
    arr1.insert(20);
    arr1.display();                     // display items
    arr1.oddEvenSort();                 // odd/even sort them
    arr1.display();                     // display them again
    System.out.println("");
    System.out.println("Now starting a new array: ");
    maxSize = 100;                 // array size
    oddEvenSorter arr2;                 // reference to array
    arr2 = new oddEvenSorter(maxSize);         // create the array
    arr2.insert(69);                    // insert 10 items
    arr2.insert(77);
    arr2.insert(73);
    arr2.insert(24);
    arr2.insert(121);
    arr2.insert(61);
    arr2.insert(25);
    arr2.insert(11);
    arr2.insert(79);
    arr2.insert(7);
    arr2.insert(80);
    arr2.insert(59);
    arr2.insert(61);
    arr2.insert(68);
    arr2.display();                     // display items
    arr2.oddEvenSort();                 // odd/even sort them
    arr2.display();                     // display them again
    System.out.println("");
  } // end main()
} // end class OddEvenSortApp
