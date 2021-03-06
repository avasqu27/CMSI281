/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  oddEvenSorter.java
 * Purpose    :  Sorts and inserts numbers
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-07
 * Description:  Sorts array using odd/even patterns
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class oddEvenSorter {
  private long[] a;                               // ref to array a
  private int nElems;                             // number of data items

  /*
    @param max ; maximum possible size of the array
  */
  //--------------------------------------------------------------
  public oddEvenSorter(int max) {                 // constructor
    a = new long[max];                            // create the array
    nElems = 0;                                   // no items yet
  }

  /*
    @param value ; element inserted into array
    @return void ; increments size of the existing array
  */
  //--------------------------------------------------------------
  public void insert(long value) {                // put element into array
    a[nElems] = value;                            // insert it
    nElems++;                                     // increment size
  }

  /*
    @return void ; displays array in string format
  */
  //--------------------------------------------------------------
  public void display() {                         // displays array contents
    for(int j=0; j<nElems; j++) {                 // for each element,
      System.out.print(a[j] + " ");               // display it
    }
    System.out.println("");
  }

  /*
    @return void ; sorts array using odd and even elements
  */
  //--------------------------------------------------------------
  public void oddEvenSort() {
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for(int j = 1; j < nElems-1; j = j+2) {     // outer loop (backward)
    //  modj = a[j]%2;                            // look at remainders (0 if even, 1 if odd)
    //  modjp = a[j+1]%2;
        if( a[j] > a[j+1]) {                      // if a[j] greater than a[j+1]
          swap(j, j+1);                           // swap them
          sorted = false;
        }
      }
      for(int i = 0; i < nElems-1; i = i+2) {     // inner loop (forward)
        if( a[i] > a[i+1]) {                      // if a[j] greater than a[j+1]
          swap(i, i+1);                           // swap them
          sorted = false;
        }
      }
    }
  }                                               // end oddEvenSort()

  /*
    @param one, two ; indexes of the values in array
    @return void; swaps the two values found in index one and two
  */
  //--------------------------------------------------------------
  private void swap(int one, int two) {
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
}                                                 // end of Array
